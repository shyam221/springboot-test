package com.example.icthealttest.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "data")
@Getter
@Setter @NoArgsConstructor
@Table(name = "data")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 255)
    public Long id;

    @Column(name = "firstname", length = 255, columnDefinition = "varchar(255)")
    public String firstname;

    @Column(name = "lastname", length = 255, columnDefinition = "varchar(255)")
    public String lastname;

    @Column(name = "dateofbirth", length = 255, columnDefinition = "datetime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Jakarta")
    public Date dateofbirth;

    @Column(name = "gender", length = 255, columnDefinition = "varchar(255)")
    public String gender;

    @Column(name = "email", length = 255, columnDefinition = "varchar(255)")
    public String email;

    @Column(name = "mobileno", length = 255, columnDefinition = "varchar(255)")
    public String mobileno;

    @Column(name = "address", length = 255, columnDefinition = "varchar(255)")
    public String address;

    @Column(name = "city", length = 255, columnDefinition = "varchar(255)")
    public String city;

    @Column(name = "state", length = 255, columnDefinition = "varchar(255)")
    public String state;

    @Column(name = "country", length = 255, columnDefinition = "varchar(255)")
    public String country;

    @Column(name = "pin", length = 255, columnDefinition = "varchar(255)")
    public String pin;

    public Data(String firstname, String lastname, String gender, Date dateofbirth, String email, String mobileno, String address, String city, String state, String country, String pin) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.dateofbirth = dateofbirth;
        this.email = email;
        this.mobileno = mobileno;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pin = pin;
    }
}
