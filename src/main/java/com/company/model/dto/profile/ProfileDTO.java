package com.company.model.dto.profile;

import com.company.model.dto.BaseDTO;
import lombok.*;

/**
 * Author : Khonimov Ulugbek
 * Date : 08.11.2022
 * Time : 11:28 AM
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileDTO extends BaseDTO {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String phone;
}




