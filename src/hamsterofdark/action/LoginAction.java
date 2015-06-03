package hamsterofdark.action;

import hamsterofdark.model.User;

import org.apache.commons.lang.StringUtils;

import service.LoginService;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8550475480942028383L;
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void validate()
	{
		if (StringUtils.isEmpty(user.getUsername()))
		{
			addFieldError("user.username", "Username cannot be blank");
		}
		if (StringUtils.isEmpty(user.getPassword()))
		{
			addFieldError("user.password", "Password cannot be blank");
		}
	
	}
	
	public String execute()
	{
		if (LoginService.isValidUser(user)) return SUCCESS;
		return LOGIN;
	}

}
