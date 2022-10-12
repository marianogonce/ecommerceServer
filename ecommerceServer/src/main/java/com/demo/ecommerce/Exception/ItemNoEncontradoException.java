package com.demo.ecommerce.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "El item no ha sido encontrado")
public class ItemNoEncontradoException extends Exception{
    public ItemNoEncontradoException() {
    }

    public ItemNoEncontradoException(String message) {
        super(message);
    }

    public ItemNoEncontradoException(Throwable cause) {
        super(cause);
    }

    public ItemNoEncontradoException(String message, Throwable cause) {
        super(message, cause);
    }
}
