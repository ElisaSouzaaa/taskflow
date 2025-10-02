package com.elisasouza.taskflow.repository;

import com.elisasouza.taskflow.enums.StatusJob;
import com.elisasouza.taskflow.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {
    List<Job> findByStatus(StatusJob status);
}
