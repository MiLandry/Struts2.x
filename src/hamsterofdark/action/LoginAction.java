package hamsterofdark.action;

import org.apache.commons.lang.StringUtils;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username;
	private String password;
	
	public void validate()
	{
		if (StringUtils.isEmpty(username))
		{
			addFieldError("username", "Username cannot be blank");
		}
		if (StringUtils.isEmpty(password))
		{
			addFieldError("password", "Password cannot be blank");
		}
	
	}
	
	public String execute()
	{
		if(username.equals("hamsterofdark") && password.equals("pass"))
		{
			return SUCCESS;
		}
		return LOGIN;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
