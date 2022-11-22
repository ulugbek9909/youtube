package com.company.model.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Author : Khonimov Ulugbek
 * Date : 08.11.2022
 * Time : 11:29 AM
 */
@Getter
@Setter
public class BaseDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String id;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}




