package com.elisasouza.taskflow.dto;

import com.elisasouza.taskflow.enums.StatusJob;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class JobResponseDTO {
    private Long id;

    @NotBlank
    @Size(max = 100)
    private String nome;

    @NotBlank
    @Size(max = 50)
    private String cronExpression;

    @NotNull
    private StatusJob status;

    @NotBlank
    private String descricao;

    private LocalDateTime ultimaExecucao;

    @NotNull
    private LocalDateTime proximaExecucao;
}
