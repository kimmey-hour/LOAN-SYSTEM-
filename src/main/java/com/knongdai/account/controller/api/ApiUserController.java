package com.knongdai.account.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.knongdai.account.entities.User;
import com.knongdai.account.entities.forms.UserLogin;
import com.knongdai.account.services.UserService;
import com.knongdai.account.utilities.HttpCode;
import com.knongdai.account.utilities.HttpMessage;
import com.knongdai.account.utilities.ResponseRecord;

@RestController
@RequestMapping("/knongdai/user")
public class ApiUserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseRecord<User> findUserByEmail(@RequestBody UserLogin userLogin){
		ResponseRecord<User> response = new ResponseRecord<>();
		User user= userService.findUserByEmail(userLogin);
		try{
			if(user == null){
				response.setCode(HttpCode.NOT_FOUND);
				response.setStatus(false);
				response.setMessage(HttpMessage.notFound());
			}else{
				response.setCode(HttpCode.OK);
				response.setStatus(true);
				response.setMessage(HttpMessage.found());
				response.setData(user);
			}
		}catch(Exception e){
			response.setCode(HttpCode.INTERNAL_SERVER_ERROR);
			response.setMessage(HttpMessage.error());
			e.printStackTrace();
		}
		return response;
	}

}
