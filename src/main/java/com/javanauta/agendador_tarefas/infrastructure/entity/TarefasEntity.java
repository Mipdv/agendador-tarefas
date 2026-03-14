package com.javanauta.agendador_tarefas.infrastructure.entity;

import com.javanauta.agendador_tarefas.infrastructure.enums.StatusNotificacaoEnum;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("Tarefa")
public class TarefasEntity {

    @Id
    private String Id;
    private String nomeTarefa;
    private String descricao;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataEvento;
    private String emailUsuario;
    private LocalDateTime DataAlteracao;
    private StatusNotificacaoEnum statusNotificacaoEnum;
}
