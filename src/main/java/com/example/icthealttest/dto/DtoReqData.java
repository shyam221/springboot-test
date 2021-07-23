package com.example.icthealttest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DtoReqData {
    String firstname;
    String lastname;
    String gender;
    String email;
    String dateofbirth;
    String mobileno;
    String address;
    String city;
    String state;
    String country;
    String pin;
}
