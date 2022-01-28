package br.com.entrevista.domain.exceptions;

public class UpperCaseByStringException extends Exception {
    private String message = "Necessário pelo menos 1 letra maiscula.";

    public UpperCaseByStringException() {
        super();
    }

    @Override
    public String getMessage() {
        return message;
    }
}