package com.elisasouza.taskflow.model;

import com.elisasouza.taskflow.enums.StatusJob;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "JOB")
@Data
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "nome", length = 100, nullable = false)
    @Size(max = 100)
    private String nome;

    @NotBlank
    @Column(name = "cron_expression",length = 50, nullable = false)
    @Size(max = 50)
    private String cronExpression;

    @Column(name = "status_job", nullable = false)
    @Enumerated(EnumType.STRING)
    @NotNull
    private StatusJob status;

    @Lob
    @Column(name = "descricao", nullable = false)
    @NotBlank
    private String descricao;

    @Column(name = "ultima_execucao")
    private LocalDateTime ultimaExecucao;

    @Column(name = "proxima_execucao", nullable = false)
    @NotNull
    private LocalDateTime proximaExecucao;

    @OneToMany(mappedBy = "job", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Execution> executions;
}
