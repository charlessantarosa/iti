package br.com.entrevista.domain.exceptions;

public class DuplicateCharactersException extends Exception {
    private String message = "Caracteres duplicados.";

    public DuplicateCharactersException() {
        super();
    }

}
