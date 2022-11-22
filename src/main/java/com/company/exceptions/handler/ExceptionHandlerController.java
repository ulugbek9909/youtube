package com.company.exceptions.handler;

import com.company.exceptions.EmailAlreadyUsedException;
import com.company.exceptions.PhoneAlreadyUsedException;
import com.company.model.dto.err.ErrorResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Author : Khonimov Ulugbek
 * Date : 08.11.2022
 * Time : 11:58 AM
 */

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler({EmailAlreadyUsedException.class, PhoneAlreadyUsedException.class})
    public ResponseEntity<?> badRequest(RuntimeException e) {

        return ResponseEntity.badRequest().body(
                ErrorResponseDTO
                        .builder()
                        .status(HttpStatus.BAD_REQUEST)
                        .code(HttpStatus.BAD_REQUEST.value())
                        .message(e.getMessage())
                        .build()
        );
    }

}




