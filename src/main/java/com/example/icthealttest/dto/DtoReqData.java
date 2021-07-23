package com.example.icthealttest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DtoReqData {
    private String firstname;
    private String lastname;
    private String gender;
    private String email;
    private String date;
    private String mobileno;
    private String address;
    private String city;
    private String state;
    private String country;
    private String pin;
}
