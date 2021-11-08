package com.wasthDev.reactecommerce.service.UserImpl;

import com.wasthDev.reactecommerce.model.User;
import com.wasthDev.reactecommerce.repository.UserRepository;
import com.wasthDev.reactecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

public class UserServiceImpl implements UserService {
    final
    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByMobile(String mobile) throws Exception {
        return userRepository.findByMobile(mobile).orElseThrow(() -> new Exception("User not Found..."));
    }

    @Override
    public User getUserDetailById(long userId) throws Exception {
        return userRepository.findById(userId).orElseThrow(() -> new Exception("User not Found..."));
    }

    @Override
    public User signupUser(HashMap<String, String> signupRequset) throws Exception {
        try {
            if (userRepository.findByMobile(signupRequset.get("mobile")).isPresent()){
                throw new Exception("User is already registered with mobile No!....");
            }
            User user = new User();
            user.setName(signupRequset.get("name"));
            user.setEmail(signupRequset.get("email"));
            user.setMobile(signupRequset.get("mobile"));
            user.setPassword(signupRequset.get("password"));
            userRepository.save(user);
            return user;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
