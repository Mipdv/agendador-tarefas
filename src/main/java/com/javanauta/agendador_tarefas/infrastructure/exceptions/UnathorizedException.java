package com.javanauta.agendador_tarefas.infrastructure.exceptions;

import javax.naming.AuthenticationException;

public class UnathorizedException extends AuthenticationException {
    public UnathorizedException(String message) {
        super(message);
    }

    public UnathorizedException(String mensagem, Throwable throwable){
        super(mensagem);
    }
}
