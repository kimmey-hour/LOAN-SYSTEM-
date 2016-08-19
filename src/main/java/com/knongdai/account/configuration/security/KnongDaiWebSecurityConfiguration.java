package com.knongdai.account.configuration.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
public class KnongDaiWebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	@Qualifier(value="ajaxAuthenticationSuccessHandler")
	private AjaxAuthenticationSuccessHandler ajaxAuthenticationSuccessHandler;
	
	@Autowired
	@Qualifier(value="ajaxAuthenticationFailureHandler")
	private AjaxAuthenticationFailureHandler ajaxAuthenticationFailureHandler;
	
	@Autowired
	@Qualifier(value="CustomUserDetailService")
	private UserDetailsService userDetailsService;
	
	@Autowired
	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		/*auth.inMemoryAuthentication().withUser("admin").password("123").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("user").password("123").roles("USER");
		auth.inMemoryAuthentication().withUser("dba").password("123").roles("ADMIN", "USER" , "DBA");
		auth.inMemoryAuthentication().withUser("dev").password("dev").roles("DEVELOPER");*/

		auth.userDetailsService(userDetailsService);
//			.passwordEncoder(passwordEncoder());
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.antMatchers("/" , "/home" , "/about" , "/swagger").permitAll()
			.antMatchers("/admin/**").hasRole("ADMIN")
			.antMatchers("/user/**").hasAnyRole("SUBSCRIBER","ADMIN")
			.antMatchers("/dba/**").hasAnyRole("ADMIN","USER" , "DBA");
			//.antMatchers("/swagger/**").hasAnyRole("ADMIN","USER" , "DBA", "DEVELOPER");
		http
			.formLogin()
			.loginPage("/login")
			.usernameParameter("username")
			.passwordParameter("password")
			.permitAll()
			.failureHandler(ajaxAuthenticationFailureHandler)
			.successHandler(ajaxAuthenticationSuccessHandler);
		
		http.csrf().disable();
		http.exceptionHandling().accessDeniedPage("/access-denied");
	}
	
	
	/*public static void main(String[] args) {

		// Encrypt Password
		System.out.println(new BCryptPasswordEncoder().encode("12345"));
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder(){
		return new BCryptPasswordEncoder();
	}*/
	
}
