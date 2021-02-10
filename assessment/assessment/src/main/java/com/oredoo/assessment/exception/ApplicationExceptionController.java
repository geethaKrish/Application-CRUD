package com.oredoo.assessment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApplicationExceptionController {

	  @ExceptionHandler(value = Exception.class)
	   public ResponseEntity<Object> exception(Exception exception) {
	      return new ResponseEntity<>("Your application cannot be processed right now", HttpStatus.INTERNAL_SERVER_ERROR);
	   }
	
}
