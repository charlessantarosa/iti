package br.com.entrevista.api.controller;

import br.com.entrevista.domain.dto.PasswdDTO;
import br.com.entrevista.domain.exceptions.NumberOfCharactersException;
import br.com.entrevista.domain.service.IApplicationService;
import br.com.entrevista.domain.utils.Password;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("passwd")
public class PasswdController {

    @Autowired
    private IApplicationService service;

    @PostMapping
    public boolean isValid(@Valid @RequestBody PasswdDTO passwdDTO) throws Exception {
        return service.isValidPass(passwdDTO);
    }

}
