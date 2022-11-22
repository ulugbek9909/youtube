package com.company.model.dto.profile;

import com.company.model.enums.ProfileRole;
import com.company.model.enums.ProfileStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author : Khonimov Ulugbek
 * Date : 08.11.2022
 * Time : 11:43 AM
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileRequest {

    private String name;
    private String surname;
    private String email;
    private String password;
    private ProfileStatus status;
    private ProfileRole role;
}




