package com.knongdai.account.utilities;

public class HttpMessage {
	/**
	 * RESPONSE MESSAGE WITH THE SUCCESSFULL TRANSACTION
	 * @param objectName
	 * @param transaction
	 * @return objectName HAS BEEN transaction SUCCESSFULLY.
	 */
	public static String success(String objectName, String transaction){
		String text = objectName + " HAS BEEN " + transaction + " SUCCESSFULLY."; 
		return text.toUpperCase();
	}
	/**
	 * RESPONSE MESSAGE WITH THE FAIL TRANSACTION
	 * @param objectName
	 * @param transaction
	 * @return objectName COULD NOT transaction.
	 */
	public static String fail(String objectName, String transaction){
		String text = objectName + " COULD NOT " + transaction + ".";
		return text;
	}
	/**
	 * RESPONSE MESSAGE WITH ERROR SERVERSIDE
	 * @return THERE ARE SOME ERROR FROM SERVERSIDE.
	 */
	public static String error(){
		return "THERE ARE SOME ERROR FROM SERVERSIDE.";
	}
	/**
	 * RETRIEVE DATA FROM SERVER WITH DATA FOUND
	 * @return RECORDS FOUND
	 */
	public static String found(){
		return "RECORDS FOUND.";
	}
	/**
	 * RETRIEVE DATA FROM SERVER WITHOUT DATA FOUND
	 * @return RECORDS NOT FOUND
	 */
	public static String notFound(){
		return "RECORDS NOT FOUND.";
	}
}
