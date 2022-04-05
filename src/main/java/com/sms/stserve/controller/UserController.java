package com.sms.stserve.controller;

import com.sms.stserve.models.SmsUsers;
import com.sms.stserve.repository.UserRepository;
import com.sms.stserve.services.UserService;
import com.sms.stserve.utils.HttpUtils;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/stbsms/auth/create",
        produces = MediaType.TEXT_PLAIN_VALUE
    )
    @ResponseBody
    public ResponseEntity<String> userRegister(@RequestBody SmsUsers rqUser){
        SmsUsers sUser = new SmsUsers();
        return null;
    }
}
