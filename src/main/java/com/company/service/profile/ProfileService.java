package com.company.service.profile;

import com.company.model.dto.profile.ProfileDTO;
import com.company.model.dto.profile.ProfileRequest;

/**
 * Author : Khonimov Ulugbek
 * Date : 08.11.2022
 * Time : 11:45 AM
 */

public interface ProfileService {
    ProfileDTO create(ProfileRequest request);
}
