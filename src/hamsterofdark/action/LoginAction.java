package hamsterofdark.action;

public class LoginAction {
	private String username;
	private String password;
	
	public String execute()
	{
		if(username.equals("hamsterofdark") && password.equals("pass"))
		{
			return "success";
		}
		return "failure";
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
