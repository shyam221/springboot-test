package com.example.icthealttest.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DtoData {
    private String firstname;
    private String lastname;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Jakarta")
    private Date dateofbirth;
    private String gender;
    private String email;
    private String mobileno;
    private String address;
    private String city;
    private String state;
    private String country;
    private String pin;
}
