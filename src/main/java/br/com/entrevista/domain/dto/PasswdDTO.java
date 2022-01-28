package br.com.entrevista.domain.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class PasswdDTO {

    @NotBlank
    @NotNull
    String passwdText;

}
