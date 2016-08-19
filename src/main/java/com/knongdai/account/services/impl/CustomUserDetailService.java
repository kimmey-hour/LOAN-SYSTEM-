package com.knongdai.account.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.knongdai.account.entities.User;
import com.knongdai.account.entities.forms.UserLogin;


@Service("CustomUserDetailService")
public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	private UserServiceImpl userService;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserLogin userLogin = new UserLogin();
		userLogin.setEmail(email);
		User user = userService.findUserByEmail(userLogin);
		if(user == null){
			System.out.println("User not found");
			throw new UsernameNotFoundException("User not found");
		}
		
		System.out.println(user.getEmail());
		System.out.println(user.getPassword());
		System.out.println(user.getRoles().get(0).getRoleName());
		
		return user;
	}
}
