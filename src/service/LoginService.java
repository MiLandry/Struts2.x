package service;

import hamsterofdark.model.User;

public class LoginService 
{
	public static boolean isValidUser(User user)
	{		
		if(user.getUsername().equals("hamsterofdark") && user.getPassword().equals("pass"))
		{
			return true;
		}
		return false;
	}

}
