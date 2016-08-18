package com.knongdai.account.services;

import com.knongdai.account.entities.User;
import com.knongdai.account.entities.forms.UserLogin;

public interface UserService {
	
	User findUserByEmail(UserLogin userLogin);

}
