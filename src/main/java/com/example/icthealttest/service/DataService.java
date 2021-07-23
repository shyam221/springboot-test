package com.example.icthealttest.service;

import com.example.icthealttest.dto.DtoData;
import com.example.icthealttest.dto.DtoReqData;

import java.text.ParseException;

public interface DataService {
    public abstract DtoData submitDataWithParams(String firstname, String lastName, String dateofbirth,
                                                 String gender, String email, String mobileno,
                                                 String address, String city, String state,
                                                 String country, String pin) throws ParseException;
    public abstract DtoData submitDataWithBody(DtoReqData request) throws ParseException;
}
