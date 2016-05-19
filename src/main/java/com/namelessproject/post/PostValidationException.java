package com.namelessproject.post;

import java.util.List;

import com.namelessproject.common.validation.ValidationFailure;

public class PostValidationException extends Exception {

	private static final long serialVersionUID = 1L;
	
	private List<ValidationFailure> validationFailures;

	public PostValidationException(List<ValidationFailure> validationFailures) {
		this.validationFailures = validationFailures;
	}
	
	public List<ValidationFailure> getValidationFailures() {
		return validationFailures;
	}
}
