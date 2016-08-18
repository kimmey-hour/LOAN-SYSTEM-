package com.knongdai.account.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.knongdai.account.entities.User;
import com.knongdai.account.entities.forms.UserLogin;
import com.knongdai.account.repositories.UserRepository;
import com.knongdai.account.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findUserByEmail(UserLogin userLogin) {		
		return userRepository.findUserByEmail(userLogin);
	}

}
