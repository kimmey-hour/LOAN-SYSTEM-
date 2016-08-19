package com.knongdai.account.configuration.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.knongdai.account.entities.User;

@Component("ajaxAuthenticationSuccessHandler")
public class AjaxAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication auth)
			throws IOException, ServletException {

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User user = (User) authentication.getPrincipal();
		
		if (user.isConfirmed() == false) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}

		response.getWriter().print(user.getEncUserId());
		response.getWriter().flush();

	}

	/*
	 * This method extracts the roles of currently logged-in user and returns
	 * appropriate URL according to his/her role.
	 */
	/*private String determineTargetUrl(Authentication authentication) {

		Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();

		List<String> roles = new ArrayList<String>();

		for (GrantedAuthority authority : authorities) {
			System.out.println(authority.getAuthority());
			roles.add(authority.getAuthority());
			System.out.println("Extract Role: " + authority.getAuthority());
		}
		if (roles.contains("ROLE_ADMIN")) {
			return "admin";
		} else if (roles.contains("ROLE_USER")) {
			return "user";
		} else if (roles.contains("ROLE_DBA")) {
			return "dba";
		} else {
			return "accessDenied";
		}

	}*/

	/*
	 * // Get API User from HttpSession private APIUser getAPIUser(){
	 * Authentication authentication =
	 * SecurityContextHolder.getContext().getAuthentication(); APIUser user =
	 * (APIUser) authentication.getPrincipal(); return user; }
	 */

}
