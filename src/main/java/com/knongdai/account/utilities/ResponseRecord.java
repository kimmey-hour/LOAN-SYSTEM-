package com.knongdai.account.utilities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseRecord<T> extends Response{
	/*
	 * RESPONSE RECORD CLASS USING WITH SINGLE OBJECT
	 */
	@JsonProperty("DATA")
	private T data;

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}
}
