package com.company.controller;

import com.company.model.dto.profile.ProfileRequest;
import com.company.service.profile.ProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author : Khonimov Ulugbek
 * Date : 08.11.2022
 * Time : 11:41 AM
 */

@RestController
@RequestMapping("/api/v1/profile")
@RequiredArgsConstructor
public class ProfileController {
    private final ProfileService profileService;

    @PostMapping("")
    public ResponseEntity<?> createProfile(@RequestParam ProfileRequest request) {

        return ResponseEntity.ok(profileService.create(request));
    }

}




