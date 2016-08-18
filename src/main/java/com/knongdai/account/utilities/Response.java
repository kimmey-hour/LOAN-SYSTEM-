package com.knongdai.account.utilities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response {
	/*
	 * RESPONSE CLASS USING WITH INSERT, UPDATEM, DELETE
	 */
	@JsonProperty("CODE")
	private String code;
	@JsonProperty("MESSAGE")
	private String message;
	@JsonProperty("STATUS")
	private boolean status;
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Response [code=" + code + ", message=" + message + ", status=" + status + "]";
	}
	

	
}
