package br.com.entrevista.domain.exceptions;

public class AllowedCaractersByStringException extends Exception {
    private String message = "Digite pelo menos 1 caracter especial permitido: !@#$%^&*()-+";

    public AllowedCaractersByStringException() {
        super();
    }

    @Override
    public String getMessage() {
        return message;
    }
}