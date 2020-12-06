package io.headhuntr.search.controller;

import io.headhuntr.search.entity.Candidate;
import io.headhuntr.search.repository.CandidateRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Tag(
        name = "Candidate Resource",
        description = "People that we want to hire"
)
@SecurityRequirement(name = "api")
@RequiredArgsConstructor
@RepositoryRestController //we need this to wire: PersistentEntityResourceAssembler
@RestController //we need this to tell swagger that this is a controller
public class CandidateAPI {

    private final CandidateRepository candidateRepository;

    @Operation(
            operationId = "candidate-clone",
            summary = "Create a Copy",
            description = "Create a new candidate from an existing saved search",
            responses = {
                    //TODO: add a response for 404 where the candidate does not exist
                    //TODO: add a response for 403 when the user is noit authorized to clone a resource
                    //TODO: add a response for 5xx to catch all errors
                    @ApiResponse(
                            description = "Cloned Successfully",
                            responseCode = "200",
                            content = @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = Candidate.class)
                            )
                    )
            }
    )
    @PostMapping("candidates/clone")
    public ResponseEntity<PersistentEntityResource> clone(
            @RequestParam("candidateId") String candidateId, PersistentEntityResourceAssembler assembler
    ) {
        var candidate = candidateRepository.findById(candidateId);

        //TODO: create a clone and return that instead

        return ResponseEntity.ok(assembler.toFullResource(candidate.get()));
    }
}
