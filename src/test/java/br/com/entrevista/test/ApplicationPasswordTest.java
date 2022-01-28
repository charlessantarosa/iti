package br.com.entrevista.test;

import br.com.entrevista.domain.dto.PasswdDTO;
import br.com.entrevista.domain.service.IApplicationService;
import br.com.entrevista.domain.service.impl.ApplicationServiceImpl;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationPasswordTest {

	@Autowired
	private IApplicationService service;

	@TestConfiguration
	static class ApplicationPasswordServiceConfiguration {

		@Bean
		public IApplicationService getInstanceApplicationService() {
			return new ApplicationServiceImpl();
		}
	}

	/** Retorna TRUE para a senha VÁLIDA. */
	@Test
	public void passwordMatchByString() throws Exception {
		String passwordText = "AbTp9!fok";
		PasswdDTO passwdDTO = new PasswdDTO();
		passwdDTO.setPasswdText(passwordText);
		Assertions.assertTrue(service.isValidPass(passwdDTO));
	}

	/** Retorna FALSE para a senha com espaço em branco. */
	@Test
	public void blankSpacePassword() throws Exception {
		String passwordText = "AbTp9 fok";
		PasswdDTO passwdDTO = new PasswdDTO();
		passwdDTO.setPasswdText(passwordText);
		Assertions.assertFalse(service.isValidPass(passwdDTO));
	}

	/** Retorna FALSE para a senha com caracteres duplicados. */
	@Test
	public void passwordWithRepeatedCharacters() throws Exception {
		String passwordText = "AbTp9!foA";
		PasswdDTO passwdDTO = new PasswdDTO();
		passwdDTO.setPasswdText(passwordText);
		Assertions.assertFalse(service.isValidPass(passwdDTO));
	}

	/** Retorna FALSE para a senha com quantidade de caracteres menor do mínimo permitido. */
	@Test
	public void LessThanMinAllowedCharacters() throws Exception {
		String passwordText = "AbTp9!fo";
		PasswdDTO passwdDTO = new PasswdDTO();
		passwdDTO.setPasswdText(passwordText);
		Assertions.assertFalse(service.isValidPass(passwdDTO));
	}

	/** Retorna FALSE para a senha com caracteres inválido. */
	@Test
	public void PasswordWithInvalidCharacters() throws Exception {
		String passwordText = "AbTp9~foa";
		PasswdDTO passwdDTO = new PasswdDTO();
		passwdDTO.setPasswdText(passwordText);
		Assertions.assertFalse(service.isValidPass(passwdDTO));
	}

	/** Retorna FALSE para a senha com AUSENCIA de caractere especial permitido. */
	@Test
	public void PasswordMissingAllowedCharacters() throws Exception {
		String passwordText = "abtp9zfoK";
		PasswdDTO passwdDTO = new PasswdDTO();
		passwdDTO.setPasswdText(passwordText);
		Assertions.assertFalse(service.isValidPass(passwdDTO));
	}

}
