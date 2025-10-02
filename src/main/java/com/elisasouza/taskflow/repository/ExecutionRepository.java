package com.elisasouza.taskflow.repository;

import com.elisasouza.taskflow.model.Execution;
import com.elisasouza.taskflow.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExecutionRepository extends JpaRepository<Execution, Long> {
    List<Execution> findByJobId(Long jobId);
    List<Execution> findTop5BByJobOrderByDataExecucaoDesc(Job job);
}
