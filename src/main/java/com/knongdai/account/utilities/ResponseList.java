package com.knongdai.account.utilities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseList<T> extends Response {
	/*
	 * RESPONSE LIST CLASS USING WITH MULTIPLE OBJECT
	 */
	@JsonProperty("DATA")
	private List<T> data;
	
	@JsonProperty("PAGINATION")
	private Pagination pagination;

	/**
	 * @return the data
	 */
	public List<T> getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(List<T> data) {
		this.data = data;
	}

	/**
	 * @return the pagination
	 */
	public Pagination getPagination() {
		return pagination;
	}

	/**
	 * @param pagination the pagination to set
	 */
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ResponseList [data=" + data + ", pagination=" + pagination + "]";
	}

}
