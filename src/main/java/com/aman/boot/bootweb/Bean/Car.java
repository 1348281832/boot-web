package com.aman.boot.bootweb.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@Component
@ToString
@Data
@AllArgsConstructor//全参
@NoArgsConstructor//无参
@ConfigurationProperties(prefix="mycar")
public class Car {
    String brand;
    float price;

}
