package com.example.icthealttest.service;

import com.example.icthealttest.dto.DtoData;
import com.example.icthealttest.dto.DtoReqData;
import com.example.icthealttest.model.Data;
import com.example.icthealttest.repository.DataRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class DataServiceImpl implements DataService{
    @Autowired
    private DataRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public DtoData submitDataWithParams(String firstname, String lastName, String dateofbirth, String gender, String email, String mobileno, String address, String city, String state, String country, String pin) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(dateofbirth);
        Data data = new Data(firstname, lastName, gender, date, email, mobileno,
                address, city, state, country, pin);
        try {
            repository.save(data);
            return modelMapper.map(data, DtoData.class);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public DtoData submitDataWithBody(DtoReqData request) throws ParseException {
        Data data = modelMapper.map(request, Data.class);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(request.getDate());
        data.setDateofbirth(date);
        try {
            repository.save(data);
            return modelMapper.map(data, DtoData.class);
        } catch (Exception e) {
            return null;
        }
    }
}
