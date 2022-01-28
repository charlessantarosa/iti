package br.com.entrevista.domain.exceptions;

public class LowerCaseByStringException extends Exception {
    private String message = "Necessário pelo menos 1 letra minuscula";

    public LowerCaseByStringException() {
        super();
    }

    @Override
    public String getMessage() {
        return message;
    }
}