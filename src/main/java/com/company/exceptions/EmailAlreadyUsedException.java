package com.company.exceptions;

/**
 * Author : Khonimov Ulugbek
 * Date : 08.11.2022
 * Time : 11:57 AM
 */

public class EmailAlreadyUsedException extends RuntimeException {
    public EmailAlreadyUsedException(String message) {
        super(message);
    }
}




