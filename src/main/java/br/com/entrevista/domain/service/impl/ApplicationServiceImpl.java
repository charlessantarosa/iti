package br.com.entrevista.domain.service.impl;

import br.com.entrevista.domain.dto.PasswdDTO;
import br.com.entrevista.domain.exceptions.DigitNotFoundByStringException;
import br.com.entrevista.domain.exceptions.NumberOfCharactersException;
import br.com.entrevista.domain.service.IApplicationService;
import br.com.entrevista.domain.utils.Password;
import org.springframework.stereotype.Service;

@Service
public class ApplicationServiceImpl implements IApplicationService {

    @Override
    public boolean isValidPass(PasswdDTO passwdDTO) {

        try {
            new Password(passwdDTO.getPasswdText())
                    .numberOfCharactersContraint()
                    .duplicateCharactersConstraint()
                    .countDigitByPasswordConstraint()
                    .lowerCaseByPasswordConstraint()
                    .upperCaseByPasswordConstraint()
                    .allowedCharactersByPasswordConstraint();

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
