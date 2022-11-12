package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class CarFactory {

    @Bean
    public Car createCar() {
        LocalDate date = LocalDate.now();
        if (date.getMonthValue()==1||date.getMonthValue()==2||date.getMonthValue()==3||date.getMonthValue()==12) {
            return new SUV();
        }else if(date.getMonthValue()==4||date.getMonthValue()==5||date.getMonthValue()==9||date.getMonthValue()==10||date.getMonthValue()==11) {
            return new Sedan();
        }else{
            return new Cabrio();

    }


    }

    @Bean
    public Car createCar2() {
        LocalDate date = LocalDate.now();
        switch (date.getMonthValue()){
            case 12:
            case 1 :
            case 2 :
                return new SUV();
            case 3 :
            case 4 :
            case 5 :
            case 9 :
            case 10 :
            case 11 :
                return new Sedan();

            default:
                return new Cabrio();

        }



    }
}
