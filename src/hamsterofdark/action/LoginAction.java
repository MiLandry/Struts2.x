package hamsterofdark.action;

import hamsterofdark.model.User;

import org.apache.commons.lang.StringUtils;

import service.LoginService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8550475480942028383L;

	private User user = new User();
	
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
			addFieldError("username", "Username cannot be blank");
		}
		if (StringUtils.isEmpty(user.getPassword()))
		{
			addFieldError("password", "Password cannot be blank");
		}
	
	}
	
	public String execute()
	{
		if (LoginService.isValidUser(user)) return SUCCESS;
		return LOGIN;
	}

	@Override
	public Object getModel() {
	return user;
	}

}
