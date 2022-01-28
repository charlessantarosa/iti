package br.com.entrevista.domain.service;

import br.com.entrevista.domain.dto.PasswdDTO;

public interface IApplicationService {
    boolean isValidPass(PasswdDTO passwdText) throws Exception;
}
