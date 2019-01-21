package com.practicejournal.registration.services;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practicejournal.registration.model.User;
import com.practicejournal.registration.repository.UserRepository;

@Service
public class RegistrationService {
    @Autowired
    private UserRepository userRepository;


    public User findByEmail(String emailAddress) {
        return userRepository.findByEmailAddress(emailAddress);
    }
    
    public User getUserById(String userId) {
        return userRepository.findOne(userId);
    }

    public void saveUser(User user){
        user.setUserId(UUID.randomUUID().toString());
        userRepository.save(user);
    }

    public void updateUser(User user){
        userRepository.save(user);
    }

    public void deleteUser(String userId){
        userRepository.delete(userId);
    }
}
