# Data Source
The query that we need to execute to provide our data

## Candidate (Main)
```sql
select
    cand_id id,
    first_name,
    last_name,
    full_name,
    ceil(total_yrs_exp*12) months_experience

from cand_profile_na
where cand_id in (select cand_id from lyndon_test_candidates)
```

## Candidate (Contact Details)
```sql
select *

from cand_contact_na
where cand_id in (select cand_id from lyndon_test_candidates)
```

## Candidate (Job History)
```sql
select
    cand_id,
    job_seq job_sequence,
    master_id company_id,
    master_company_name company_name,
    job_title title,
    job_description description,
    date_job_start job_start,
    date_job_end job_end,
    work_loc work_location,
    ceil(yrs_exp*12) months_experience

from job_hist_na
where cand_id in (select cand_id from lyndon_test_candidates)
```