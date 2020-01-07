package com.example.estudiante.exceptions;

import java.util.UUID;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


import com.example.estudiante.exceptions.BadFormatException;
import com.example.estudiante.exceptions.ErrorCode;


public class ExceptionsHandler {
	
	@ExceptionHandler(BadFormatException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorCode badFormatoException(BadFormatException e) {
		ErrorCode ec = new ErrorCode();
		ec.setCodigo(this.Id());
		ec.setMensaje(e.getMessage());
		logError(ec, e);
		return ec;
	}
	
	@ExceptionHandler(ExtendedCodeException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorCode extendedCodeException(ExtendedCodeException e) {
		ErrorCode ec = new ErrorCode();
		ec.setCodigo(this.Id());
		ec.setMensaje(e.getMessage());
		logError(ec, e);
		return ec;
	}
	
	@ExceptionHandler(ValueNotAllowedException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorCode valueNotAllowedException(ValueNotAllowedException e) {
		ErrorCode ec = new ErrorCode();
		ec.setCodigo(this.Id());
		ec.setMensaje(e.getMessage());
		logError(ec, e);
		return ec;
	}
	
	@ExceptionHandler(NotFoundException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorCode notFoundException(NotFoundException e) {
		ErrorCode ec = new ErrorCode();
		ec.setCodigo(this.Id());
		ec.setMensaje(e.getMessage());
		logError(ec, e);
		return ec;
	}
	
	private static final Logger LOG = Logger.getLogger(ExceptionHandler.class.getName());
	private void logError(ErrorCode ec, Exception e) {
		LOG.severe(ec.getCodigo());
		LOG.severe(ec.getMensaje());
		LOG.severe(e.getMessage());
	}
	
	public String Id() {
		return UUID.randomUUID().toString();
	}
}
