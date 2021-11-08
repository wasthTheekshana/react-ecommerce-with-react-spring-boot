package com.wasthDev.reactecommerce.service;

import com.wasthDev.reactecommerce.model.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public interface UserService {

    User findByMobile(String mobile) throws Exception;
    User getUserDetailById(long userId) throws Exception;
    User signupUser(HashMap<String,String> signupRequset) throws Exception;
}
