package com.romulocurso.cursomc.resources.exception;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ResourceExceptionHandler {

	public ResponseEntity<StandardError> objNotFound(ObjectNotFoundException e, HttpServletRequest request) {		
		StandardError err = new StandardError( HttpStatus.NOT_FOUND.value(), e.getMessage(), System.currentTimeMillis() );
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
	}
}