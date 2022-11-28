package com.hospital.review.service;

import com.hospital.review.domain.dto.UserDto;
import com.hospital.review.domain.dto.UserJoinRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    // userName, password를 받아서 회원가입 처리
    public UserDto join(UserJoinRequest request) {
        return new UserDto("","","");
    }
}
