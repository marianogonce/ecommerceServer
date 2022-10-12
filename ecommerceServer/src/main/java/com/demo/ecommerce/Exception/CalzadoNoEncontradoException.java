package com.demo.ecommerce.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "El calzado no ha sido encontrado")
public class CalzadoNoEncontradoException extends Exception {
    public CalzadoNoEncontradoException() {
    }

    public CalzadoNoEncontradoException(String message) {
        super(message);
    }

    public CalzadoNoEncontradoException(Throwable cause) {
        super(cause);
    }

    public CalzadoNoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }
}
