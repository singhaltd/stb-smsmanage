package com.sms.stserve.services;

import com.sms.stserve.models.SmsUsers;
import com.sms.stserve.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    
    public void uCreate(SmsUsers student) {
        userRepository.save(student);
   }
}
