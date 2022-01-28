package br.com.entrevista.domain.exceptions;

public class NumberOfCharactersException extends Exception {

    private String message = "Minimo de 9 caracteres.";

    public NumberOfCharactersException() { super(); }

    @Override
    public String getMessage() {
        return message;
    }
}
