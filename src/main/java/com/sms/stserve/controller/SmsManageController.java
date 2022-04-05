package com.sms.stserve.controller;

import javax.servlet.http.HttpServletRequest;

import com.sms.stserve.models.RequestSmsend;
import com.sms.stserve.utils.HttpUtils;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmsManageController {
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/stbsms/send",
        produces = MediaType.TEXT_PLAIN_VALUE
    )
    @ResponseBody
    public ResponseEntity<String> SendSmsBody(@RequestBody RequestSmsend sms, HttpServletRequest request){
        String ip = HttpUtils.getRequestIP(request);
        return ResponseEntity.ok(ip);
    }
}
