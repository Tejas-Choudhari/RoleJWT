package com.example.RoleJWT.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

//import jakarta.validation.ConstraintViolation;
//import jakarta.validation.ConstraintViolationException;

@ControllerAdvice
public class GlobalCustomExceptionHandler extends ResponseEntityExceptionHandler{

	@Autowired
	Responses response;

	/**
	 * print the data in the format of the JSON
	 */


	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {

		List<String> defalutMessage = ex.getBindingResult().getFieldErrors().stream()
				.map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.toList());
		String errorMessage = String.join(",", defalutMessage);

		// customizing the response for the application i.e. Error Code / Status / Error Message.
		response.setErrorCode("400");
		response.setStatus(" Status Falied");
		response.setErrorMessage(errorMessage);
		return new ResponseEntity<Object>(response, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler({ CustomException.class })
	public ResponseEntity<Object> yourExceptionHandler(Exception e) {
		logger.error("Stack trace {}", e.fillInStackTrace());
		// customizing the response for the application i.e. Error Code / Status / Error Message.
		response.setErrorCode("400");
		response.setStatus(" Status Falied");
		response.setErrorMessage(e.getMessage());
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}


}
