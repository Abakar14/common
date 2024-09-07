package com.bytmasoft.common.exception;

import io.jsonwebtoken.ExpiredJwtException;
import jakarta.persistence.EntityNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Slf4j
@ControllerAdvice
public class AuthControllerAdvice extends ResponseEntityExceptionHandler{




	@ExceptionHandler(ExpiredJwtException.class)
	public ResponseEntity<CustomErrorResponse> handleExpiredJwtException(ExpiredJwtException ex, WebRequest request) {
		String path = request.getDescription(false); // URL and query string

		CustomErrorResponse errorResponse = customErrorResponse(HttpStatus.UNAUTHORIZED.value(), " JWT Token Expired ",
				"Token expired  at: " + path);

		return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
	}


	@ExceptionHandler(DSSUnauthorizedExpception.class)
	public ResponseEntity<CustomErrorResponse> handleDSSUnauthorizedExpception(DSSUnauthorizedExpception ex, WebRequest request) {
		String path = request.getDescription(false); // URL and query string

		CustomErrorResponse errorResponse = customErrorResponse(HttpStatus.UNAUTHORIZED.value(), " Unauthorized request ",
				"Unauthorized request  at: " + path);

		return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
	}

	@ExceptionHandler(AccessDeniedException.class)
	public ResponseEntity<CustomErrorResponse> handleAccessDeniedException(AccessDeniedException ex, WebRequest request) {
		String path = request.getDescription(false); // URL and query string

		CustomErrorResponse errorResponse = customErrorResponse(HttpStatus.FORBIDDEN.value(), "Access Denied",
				"Access Denied at: " + path);

		return new ResponseEntity<>(errorResponse, HttpStatus.FORBIDDEN);
	}

	@ExceptionHandler(AuthenticationCredentialsNotFoundException.class)
	public ResponseEntity<CustomErrorResponse> handleAuthenticationException(AuthenticationCredentialsNotFoundException ex, WebRequest request) {

		String path = request.getDescription(false);
		CustomErrorResponse errorResponse = customErrorResponse(HttpStatus.UNAUTHORIZED.value() , "Unauthorized",
				"Unauthorized access attempt at: " + path);
		return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
	}


	@ExceptionHandler(DSSConfilictExpception.class)
	public ResponseEntity<CustomErrorResponse> handleDSSConfilictExpception(DSSConfilictExpception ex, WebRequest request) {
		String path = request.getDescription(false); // URL and query string

		CustomErrorResponse errorResponse = customErrorResponse(HttpStatus.CONFLICT.value(), "Conflict ",
				"Conflict   at: " + path);

		return new ResponseEntity<>(errorResponse, HttpStatus.FORBIDDEN);
	}

	@ExceptionHandler(DSSBadRequestExpception.class)
	public ResponseEntity<CustomErrorResponse> handleDSSBadRequestExpception(DSSBadRequestExpception ex, WebRequest request) {
		String path = request.getDescription(false); // URL and query string

		CustomErrorResponse errorResponse = customErrorResponse(HttpStatus.BAD_REQUEST.value(), "Bad Request",
				"Bad Request  at: " + path);

		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(DSSServiceUnavailableExpception.class)
	public ResponseEntity<CustomErrorResponse> handleDSSServiceUnavailableExpception(DSSServiceUnavailableExpception ex, WebRequest request) {
		String path = request.getDescription(false); // URL and query string

		CustomErrorResponse errorResponse = customErrorResponse(HttpStatus.SERVICE_UNAVAILABLE.value(), "Service Unavailable",
				"Service Unavailable  at: " + path);

		return new ResponseEntity<>(errorResponse, HttpStatus.SERVICE_UNAVAILABLE);
	}

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<CustomErrorResponse> handleNullPointerException(NullPointerException ex, WebRequest request) {

		String path = request.getDescription(false); // URL and query string

		CustomErrorResponse errorResponse = customErrorResponse(HttpStatus.CONFLICT.value(), "NULL Pointer Exception",
				"NULL Pointer at: " + path);

		return new ResponseEntity<>(errorResponse, HttpStatus.SERVICE_UNAVAILABLE);

	}





	// Handle other exceptions globally if needed
	@ExceptionHandler(Exception.class)
	public ResponseEntity<CustomErrorResponse> handleGlobalException(Exception ex, WebRequest request) {
		String path = request.getDescription(false);
		CustomErrorResponse errorResponse = customErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(),  "Internal Server Error",
				ex.getMessage());

		return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(DSSEntityNotFoundException.class)
	public  ResponseEntity<CustomErrorResponse> handelDSSEntityNotFoundException(DSSEntityNotFoundException ex, WebRequest request){
		String path = request.getDescription(false);
		CustomErrorResponse errorResponse = customErrorResponse(HttpStatus.NOT_FOUND.value(),  "Not found ",
				ex.getMessage());
		return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
		
	}





	private CustomErrorResponse customErrorResponse(int status , String error, String message) {
	return  CustomErrorResponse.builder()
				.status(status)
				.error(error)
				.message(message)
				.build();
	}

}
