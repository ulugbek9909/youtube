package com.company.model.dto.err;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

/**
 * Author : Khonimov Ulugbek
 * Date : 08.11.2022
 * Time : 12:00 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponseDTO {
    private Integer code;
    private String message;
    private HttpStatus status;
    private LocalDateTime timestamp;
}




