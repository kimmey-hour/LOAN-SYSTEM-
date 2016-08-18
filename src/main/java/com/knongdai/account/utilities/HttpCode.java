package com.knongdai.account.utilities;

public class HttpCode {
	/*
	 * DEFINE OUR OWN CODE WHEN RESPONSE DATA TO CLIENT
	 * USING IT FOR EASY TO COMPARE THE SUCCESS, ERROR, NOT FOUND, AND FOUND
	 */
	public static final String OK						 = "200";
	public static final String CREATED 					 = "201";
	public static final String BAD_REQUEST				 = "400";
	public static final String UNAUTHORIZED  			 = "401";
	public static final String FORBIDDENT    		     = "403";
	public static final String NOT_FOUND 				 = "404";
	public static final String INTERNAL_SERVER_ERROR     = "500";
}
