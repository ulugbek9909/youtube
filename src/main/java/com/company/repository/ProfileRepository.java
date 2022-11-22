package com.company.repository;

import com.company.model.entity.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Repository
public interface ProfileRepository extends GenericRepository<ProfileEntity> {

    Optional<ProfileEntity> findByPhone(String phone);

    Optional<ProfileEntity> findByEmail(String email);

}