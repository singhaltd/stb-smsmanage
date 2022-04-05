package com.sms.stserve.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="SMS_REQ_TYPE")
public class SmsReqType {
    @Id
    private String txtype;
    private String txdesc;
    private String cannel;
    private String qrySeq;
}
