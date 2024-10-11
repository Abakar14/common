package com.bytmasoft.common.exception.controller;

import com.bytmasoft.common.exception.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.nio.file.AccessDeniedException;


@ControllerAdvice
public class DSSControllerAdvice extends ResponseEntityExceptionHandler{

	 private Logger logger = LoggerFactory.getLogger(DSSControllerAdvice.class);


	@ExceptionHandler(Exception.class)
	public ResponseEntity<DSSErrorResponse> handleGeneralException(Exception ex, WebRequest request) {
		logger.error("An error occurred: {}", ex.getMessage(), ex);
		String path = request.getDescription(false); // URL and query string

		DSSErrorResponse errorResponse = customErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), " SERVICE_SPECIFIC_ERROR",
				"SERVICE_SPECIFIC_ERROR at: " + path);

		return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

/*	@ExceptionHandler(ExpiredJwtException.class)
	public ResponseEntity<DSSErrorResponse> handleExpiredJwtException(ExpiredJwtException ex, WebRequest request) {
		logger.error("An error occurred: {}", ex.getMessage(), ex);
		String path = request.getDescription(false); // URL and query string

		DSSErrorResponse errorResponse = customErrorResponse(HttpStatus.UNAUTHORIZED.value(), " JWT Token Expired ",
				"JWT Token has expired  at: " + path);

		return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
	}*/


	@ExceptionHandler(DSSUnauthorizedExpception.class)
	public ResponseEntity<DSSErrorResponse> handleDSSUnauthorizedExpception(DSSUnauthorizedExpception ex, WebRequest request) {
		logger.error("An error occurred: {}", ex.getMessage(), ex);
		String path = request.getDescription(false); // URL and query string

		DSSErrorResponse errorResponse = customErrorResponse(HttpStatus.UNAUTHORIZED.value(), " Unauthorized request ",
				"Unauthorized request  at: " + path);

		return new ResponseEntity<>(errorResponse, HttpStatus.UNAUTHORIZED);
	}


	@ExceptionHandler(DSSConfilictExpception.class)
	public ResponseEntity<DSSErrorResponse> handleDSSConfilictExpception(DSSConfilictExpception ex, WebRequest request) {
		logger.error("An error occurred: {}", ex.getMessage(), ex);
		String path = request.getDescription(false); // URL and query string

		DSSErrorResponse errorResponse = customErrorResponse(HttpStatus.CONFLICT.value(), "Conflict ",
				"Conflict   at: " + path);

		return new ResponseEntity<>(errorResponse, HttpStatus.FORBIDDEN);
	}

	@ExceptionHandler(DSSBadRequestExpception.class)
	public ResponseEntity<DSSErrorResponse> handleDSSBadRequestExpception(DSSBadRequestExpception ex, WebRequest request) {
		logger.error("An error occurred: {}", ex.getMessage(), ex);
		String path = request.getDescription(false); // URL and query string

		DSSErrorResponse errorResponse = customErrorResponse(HttpStatus.BAD_REQUEST.value(), "Bad Request",
				"Bad Request  at: " + path);

		return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(DSSServiceUnavailableExpception.class)
	public ResponseEntity<DSSErrorResponse> handleDSSServiceUnavailableExpception(DSSServiceUnavailableExpception ex, WebRequest request) {
		logger.error("An error occurred: {}", ex.getMessage(), ex);
		String path = request.getDescription(false); // URL and query string

		DSSErrorResponse errorResponse = customErrorResponse(HttpStatus.SERVICE_UNAVAILABLE.value(), "Service Unavailable",
				"Service Unavailable  at: " + path);

		return new ResponseEntity<>(errorResponse, HttpStatus.SERVICE_UNAVAILABLE);
	}

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<DSSErrorResponse> handleNullPointerException(NullPointerException ex, WebRequest request) {
		logger.error("An error occurred: {}", ex.getMessage(), ex);
		String path = request.getDescription(false); // URL and query string

		DSSErrorResponse errorResponse = customErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), "NULL Pointer Exception",
				"NULL Pointer at: " + path);

		return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);

	}


	@ExceptionHandler(DSSEntityNotFoundException.class)
	public  ResponseEntity<DSSErrorResponse> handelDSSEntityNotFoundException(DSSEntityNotFoundException ex, WebRequest request){
		logger.error("An error occurred: {}", ex.getMessage(), ex);
		String path = request.getDescription(false);
		DSSErrorResponse errorResponse = customErrorResponse(HttpStatus.NOT_FOUND.value(),  "Not found ",
				ex.getMessage());
		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
		
	}

	@ExceptionHandler(StorageFileNotFoundException.class)
	public ResponseEntity<DSSErrorResponse> handleStorageFileNotFoundException(StorageFileNotFoundException ex, WebRequest request) {
		logger.error("An error occurred: {}", ex.getMessage(), ex);
		String path = request.getDescription(false); // URL and query string

		DSSErrorResponse errorResponse = customErrorResponse(
				HttpStatus.NOT_FOUND.value(),
				"Document not found ",
				 ex.getMessage() );

		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
	}


	@ExceptionHandler(StorageException.class)
	public ResponseEntity<DSSErrorResponse> handleStorageException(StorageException ex, WebRequest request) {
		logger.error("An error occurred: {}", ex.getMessage(), ex);
		String path = request.getDescription(false); // URL and query string

		DSSErrorResponse errorResponse = customErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR.value(), " no value found ",
				"Token expired  at: " + path);

		return new ResponseEntity<>(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);


	}

	@ExceptionHandler(DSSNotImplementedExpception.class)
	public ResponseEntity<DSSErrorResponse> handleNotImplementedExpception(DSSNotImplementedExpception ex, WebRequest request) {
		logger.error("An error occurred: {}", ex.getMessage(), ex);
		String path = request.getDescription(false); // URL and query string

		DSSErrorResponse errorResponse = customErrorResponse(HttpStatus.NOT_IMPLEMENTED.value(), " Server does not support ",
				"Server does not Support at: " + path);

		return new ResponseEntity<>(errorResponse, HttpStatus.NOT_IMPLEMENTED);
	}

	@ExceptionHandler(DSSGatewayTimeoutExpception.class)
	public ResponseEntity<DSSErrorResponse> handleGatewayTimeoutExpception(DSSGatewayTimeoutExpception ex, WebRequest request) {
		logger.error("An error occurred: {}", ex.getMessage(), ex);
		String path = request.getDescription(false); // URL and query string

		DSSErrorResponse errorResponse = customErrorResponse(HttpStatus.GATEWAY_TIMEOUT.value(), " Server timeout ",
				"The server did not receive a timely response: " + path);
		return new ResponseEntity<>(errorResponse, HttpStatus.GATEWAY_TIMEOUT);
	}

	@ExceptionHandler(AccessDeniedException.class)
	public ResponseEntity<DSSErrorResponse> handleAccessDeniedException(AccessDeniedException ex, WebRequest request) {
		logger.error("An error occurred: {}", ex.getMessage(), ex);
		String path = request.getDescription(false); // URL and query string

		DSSErrorResponse errorResponse = customErrorResponse(HttpStatus.FORBIDDEN.value(), "Access Denied",
				"Access Denied " + path);
		return new ResponseEntity<>(errorResponse, HttpStatus.FORBIDDEN);
	}




	private DSSErrorResponse customErrorResponse(int status , String error, String message) {
	return  DSSErrorResponse.builder()
				.statusCode(status)
				.errorCode(error)
				.message(message)
				.build();
	}

}
