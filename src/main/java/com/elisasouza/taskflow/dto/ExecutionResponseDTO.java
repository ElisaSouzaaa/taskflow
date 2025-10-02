package com.elisasouza.taskflow.dto;

import com.elisasouza.taskflow.enums.StatusExecution;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ExecutionResponseDTO {
    private Long id;
    private Long jobId;
    private StatusExecution status;
    private String mensagem;
    private LocalDateTime dataExecucao;
    private LocalDateTime duracaoExecucao;
}
