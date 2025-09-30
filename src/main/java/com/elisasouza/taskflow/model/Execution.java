package com.elisasouza.taskflow.model;

import com.elisasouza.taskflow.enums.StatusExecution;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "EXECUTION")
@Data
public class Execution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_id", nullable = false)
    private Job job;

    @Column(name = "status_execution", nullable = false)
    @Enumerated(EnumType.STRING)
    @NotNull
    private StatusExecution status;

    @Column(name = "mensagem",length = 500, nullable = false)
    @NotNull
    private String mensagem;

    @Column(name = "data_execucao", nullable = false)
    @NotNull
    private LocalDateTime dataExecucao;

    @Column(name = "duracao_execucao", nullable = false)
    @NotNull
    private Long duracaoExecucao;
}
