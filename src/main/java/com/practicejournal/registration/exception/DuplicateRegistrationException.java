package com.practicejournal.registration.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class DuplicateRegistrationException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;

    public DuplicateRegistrationException(String exception) {
        super(exception);
    }

}
