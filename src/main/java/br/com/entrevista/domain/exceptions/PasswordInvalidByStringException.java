package br.com.entrevista.domain.exceptions;

public class PasswordInvalidByStringException extends Exception {

    private String message = "Senha Inválida";

    public PasswordInvalidByStringException() {
        super();
    }

}