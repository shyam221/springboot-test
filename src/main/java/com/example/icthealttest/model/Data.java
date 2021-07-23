package com.example.icthealttest.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter @NoArgsConstructor
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

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

    public Data(String firstname, String lastname, String gender, String email, String mobileno, String address, String city, String state, String country, String pin) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.email = email;
        this.mobileno = mobileno;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pin = pin;
    }
}
