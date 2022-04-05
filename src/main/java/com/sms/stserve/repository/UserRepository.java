package com.sms.stserve.repository;

import com.sms.stserve.models.SmsUsers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<SmsUsers, Long> {
    
}
