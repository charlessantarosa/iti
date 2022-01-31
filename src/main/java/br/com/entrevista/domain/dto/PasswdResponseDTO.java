package br.com.entrevista.domain.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class PasswdResponseDTO {
    @NotBlank
    @NotNull
    boolean result;

    public PasswdResponseDTO(boolean result) {
        this.result = result;
    }

}
