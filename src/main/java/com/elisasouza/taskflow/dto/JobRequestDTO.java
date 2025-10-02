package com.elisasouza.taskflow.dto;

import com.elisasouza.taskflow.enums.StatusJob;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class JobRequestDTO {
    @NotBlank
    @Size(max = 100)
    private String nome;

    @NotBlank
    @Size(max = 50)
    private String cronExpression;

    @NotBlank
    private String descricao;
}
