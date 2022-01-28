package br.com.entrevista.domain.exceptions;

public class DigitNotFoundByStringException  extends Exception {
    private String message = "Não foram encontrados digitos.";

    public DigitNotFoundByStringException() {
        super();
    }

    @Override
    public String getMessage() {
        return message;
    }
}