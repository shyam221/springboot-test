package com.example.icthealttest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DtoData {
    String firstname;
    String lastname;
    String dateofbirth;
    String gender;
    String email;
    String mobileno;
    String address;
    String city;
    String state;
    String country;
    String pin;
}
