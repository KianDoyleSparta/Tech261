package com.sparta.kd.webclientapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Response{

	@JsonProperty("result")
	private Result result;

	@JsonProperty("status")
	private Integer status;

	public Result getResult(){
		return result;
	}

	public Integer getStatus(){
		return status;
	}
}