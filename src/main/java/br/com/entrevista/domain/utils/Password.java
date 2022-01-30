package br.com.entrevista.domain.utils;

import br.com.entrevista.domain.exceptions.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {

    private String passwordText;

    public Password(String text) {
        this.passwordText = text;
    }


    public Password numberOfCharactersContraint() throws NumberOfCharactersException {
        int numberOfCharactersMax= 9;
        if(this.passwordText.length() < numberOfCharactersMax)
            throw new NumberOfCharactersException();
        return this;
    }

    public Password duplicateCharactersConstraint() throws DuplicateCharactersException {
        if(this.passwordText.length() != this.passwordText.chars().distinct().count())
            throw new DuplicateCharactersException();
        return this;
    }

    public Password countDigitByPasswordConstraint() throws DigitNotFoundByStringException {
        int digitsFound = 0;
        for (int i = 0; i < this.passwordText.length(); i++) {
            if(Character.isDigit(this.passwordText.charAt(i))) digitsFound++;
        }
        if(digitsFound == 0) throw new DigitNotFoundByStringException();
        return this;
    }

    public Password lowerCaseByPasswordConstraint() throws LowerCaseByStringException {

        int contWordLowerCase = 0;
        for (int i = 0; i < this.passwordText.length(); i++) {
            if(Character.isLowerCase(this.passwordText.charAt(i))) contWordLowerCase++;
        }
        if(contWordLowerCase == 0) throw new LowerCaseByStringException();
        return this;
    }

    public Password upperCaseByPasswordConstraint() throws UpperCaseByStringException {

        int contWordUpperCase = 0;
        for (int i = 0; i < this.passwordText.length(); i++) {
            if(Character.isUpperCase(this.passwordText.charAt(i))) contWordUpperCase++;
        }
        if(contWordUpperCase == 0) throw new UpperCaseByStringException();
        return this;
    }

    public Password allowedCharactersByPasswordConstraint() throws AllowedCaractersByStringException {
        final String regex = "[a-zA-Z0-9!@#$%^&*()\\-+]";
        final Pattern pattern = Pattern.compile(regex);
        for (int i=0; i < this.passwordText.length(); i++) {
            char ch = this.passwordText.charAt(i);
            Matcher matcher = pattern.matcher(Character.toString(ch));
            boolean isMatch = matcher.find();
            if(!isMatch) throw new AllowedCaractersByStringException();
        }
        return this;
    }

/**
    public boolean hasRepeatedCharacters() {
        int p = -1, i, j;
        for (i = 0; i < this.passwordText.length(); i++) {
            for (j = i + 1; j < this.passwordText.length(); j++) {
                if (this.passwordText.charAt(i) == this.passwordText.charAt(j)) {
                    p = i;
                    break;
                }
            }
            if (p != -1)
                break;
        }
        return (p < 0) ? false : true;
    }
*/
}
