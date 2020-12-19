package io.headhuntr.search.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.List;

@NoRepositoryBean
public interface BasicSearchRepository<T> extends Repository<T, String> {

    Page<T> findAll(Pageable pageable);
    Page<T> findByIdIn(List<String> ids, Pageable pageable);
}
