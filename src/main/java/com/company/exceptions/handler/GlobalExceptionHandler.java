package com.company.exceptions.handler;

import com.company.model.dto.err.ErrorResponseDTO;
import lombok.NonNull;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

/**
 * Author : Khonimov Ulugbek
 * Date : 09.11.2022
 * Time : 6:01 PM
 */

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @Override
    @NonNull
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException ex,
            @NonNull HttpHeaders headers,
            @NonNull HttpStatus status,
            @NonNull WebRequest request) {

        return ResponseEntity.badRequest().body(
                ErrorResponseDTO
                        .builder()
                        .status(status)
                        .code(status.value())
                        .timestamp(LocalDateTime.now())
                        .message(ex.getMessage())
        );
    }
}




