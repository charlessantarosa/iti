package br.com.entrevista.domain.exceptions;

public class AllowedCaractersByStringException extends Exception {
    private String message = "Digite apenas caracteres especiais permitidos: !@#$%^&*()-+";

    public AllowedCaractersByStringException() {
        super();
    }

    @Override
    public String getMessage() {
        return message;
    }
}