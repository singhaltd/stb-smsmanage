package com.sms.stserve.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SmsUsers")
public class SmsUsers {
    @Id
    private String userId;
    @Column(nullable = false,unique = true)
    private String userName;
    @Column()
    private String password;
    @Column(nullable = false,unique = true)
    private String clientIp;
    @Column()
    private String urole;

    public SmsUsers(){

    }

    public SmsUsers(String username,String password,String client_ip, String urole){
        this.userId = username;
        this.userName = username;
        this.clientIp = client_ip;
        this.password = password;
        this.urole = urole;
    }
}
