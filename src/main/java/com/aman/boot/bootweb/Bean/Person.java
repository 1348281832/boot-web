package com.aman.boot.bootweb.Bean;


import lombok.Data;
import java.util.Date;
@Data
public class Person {

    private String userName;
    private Date birth;
    private Integer age;
    private TomcatPet pet;
}