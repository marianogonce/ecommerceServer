package com.demo.ecommerce.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.CONFLICT, reason = "El usuario ya existe")
public class SuscriptorYaRegistradoException extends Exception{
    public SuscriptorYaRegistradoException() {
    }

    public SuscriptorYaRegistradoException(String message) {
        super(message);
    }

    public SuscriptorYaRegistradoException(Throwable cause) {
        super(cause);
    }

    public SuscriptorYaRegistradoException(String message, Throwable cause) {
        super(message, cause);
    }
}
