package in.co.job.portal.form;

import javax.validation.constraints.NotEmpty;

import in.co.job.portal.dto.BaseDTO;
import in.co.job.portal.dto.UserDTO;



public class LoginForm extends BaseForm {

	@NotEmpty(message = "Login is required")
	private String login;
	@NotEmpty(message = "Password is required")
	private String password;


	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public BaseDTO getDto() {
		UserDTO dto=new UserDTO();
		dto.setLogin(login);
		dto.setPassword(password);
		return dto;
	}

	@Override
	public void populate(BaseDTO bDto) {
		UserDTO dto=(UserDTO) bDto;
		login=dto.getLogin();
		password=dto.getPassword();
	}

}
