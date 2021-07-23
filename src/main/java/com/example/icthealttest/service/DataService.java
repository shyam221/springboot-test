package com.example.icthealttest.service;

import com.example.icthealttest.dto.DtoData;
import com.example.icthealttest.dto.DtoReqData;
import com.example.icthealttest.model.Data;
import com.example.icthealttest.repository.DataRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@Service
public class DataService {
    @Autowired
    DataRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    public DtoData submitDataWithParams(String firstname, String lastName, String dateofbirth,
                              String gender, String email, String mobileno,
                              String address, String city, String state,
                              String country, String pin) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Data data = new Data(firstname, lastName, gender, email, mobileno,
                address, city, state, country, pin);
        try {
            data.setDateofbirth(dateofbirth);
            repository.save(data);
            return modelMapper.map(data, DtoData.class);
        } catch (Exception e) {
            return null;
        }
    }

    public DtoData submitDataWithBody(DtoReqData request) {
        Data data = modelMapper.map(request, Data.class);
        try {
            repository.save(data);
            return modelMapper.map(data, DtoData.class);
        } catch (Exception e) {
            return null;
        }
    }
}
