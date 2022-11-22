package com.company.service.profile;

import com.company.exceptions.EmailAlreadyUsedException;
import com.company.exceptions.PhoneAlreadyUsedException;
import com.company.model.dto.profile.ProfileDTO;
import com.company.model.dto.profile.ProfileRequest;
import com.company.model.entity.ProfileEntity;
import com.company.repository.ProfileRepository;
import com.company.service.AbstractService;
import org.springframework.stereotype.Service;

/**
 * Author : Khonimov Ulugbek
 * Date : 08.11.2022
 * Time : 11:45 AM
 */

@Service
public class ProfileServiceImpl extends AbstractService<ProfileRepository> implements ProfileService {

    public ProfileServiceImpl(ProfileRepository repository) {
        super(repository);
    }

    @Override
    public ProfileDTO create(ProfileRequest request) {
        var email = repository.findByEmail(request.getEmail());
        var phone = repository.findByPhone(request.getPhone());
        if (email.isPresent()) {
            throw new EmailAlreadyUsedException("This email already used!");
        }
        if (phone.isPresent()) {
            throw new PhoneAlreadyUsedException("This phone number already used!");
        }
        var profile = modelMapper.map(request, ProfileEntity.class);
        var entity = repository.save(profile);
        return modelMapper.map(entity, ProfileDTO.class);
    }
}




