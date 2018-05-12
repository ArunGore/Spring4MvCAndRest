package com.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(Throwable.class)
	public ResponseEntity<String> sendMessage(Throwable throwable) {
		System.out.println("Exception Occur : ");
		throwable.printStackTrace();
		
		String message = throwable.getMessage();
		ResponseEntity<String> responseEntity = new ResponseEntity<String>(message, HttpStatus.INTERNAL_SERVER_ERROR);
		return responseEntity;

	}
}
