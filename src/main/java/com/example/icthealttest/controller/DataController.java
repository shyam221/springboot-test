package com.example.icthealttest.controller;

import com.example.icthealttest.dto.DtoData;
import com.example.icthealttest.dto.DtoReqData;
import com.example.icthealttest.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
@RequestMapping("/api/data")
public class DataController {
    @Autowired
    DataService dataService;

    @GetMapping("")
    ResponseEntity<DtoData> submitDataWithParams(@RequestParam("firstname") String firstname,
                                      @RequestParam("lastname") String lastName,
                                      @RequestParam(name = "dateofbirth", required = false) String dateofbirth,
                                      @RequestParam("gender") String gender,
                                      @RequestParam("email") String email,
                                      @RequestParam("mobileno") String mobileno,
                                      @RequestParam("address") String address,
                                      @RequestParam("city") String city,
                                      @RequestParam("state") String state,
                                      @RequestParam("country") String country,
                                      @RequestParam("pin") String pin) throws ParseException {
        DtoData data = dataService.submitDataWithParams(firstname, lastName, dateofbirth, gender, email, mobileno, address, city, state, country, pin);
        return ResponseEntity.status(HttpStatus.OK).body(data);
    }
    @PostMapping("/submit")
    ResponseEntity<DtoData> submitWithBody(@RequestBody DtoReqData request) {
        DtoData data = dataService.submitDataWithBody(request);
        return ResponseEntity.status(HttpStatus.OK).body(data);
    }
}
