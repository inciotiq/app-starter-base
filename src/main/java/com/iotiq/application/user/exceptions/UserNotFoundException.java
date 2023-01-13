package com.iotiq.application.user.exceptions;

import com.iotiq.commons.exceptions.EntityNotFoundException;

public class UserNotFoundException extends EntityNotFoundException {
    protected UserNotFoundException(Object... args) {
        super("user", args);
    }
}
