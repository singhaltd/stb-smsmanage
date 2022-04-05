package com.sms.stserve.models;

public class RequestSmsend {
    String mobile;
    String message;
    public RequestSmsend(String mobile, String message) {

        this.mobile = mobile;
        this.message = message;
    }

    public String toString() {
        return mobile + " " + message;
    }
}
