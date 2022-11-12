package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
public class CarFactoryTestSuite {

    @Test
    public void ShouldLightsTurnedOn(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("createCar");
        LocalTime time = LocalTime.now();
        boolean lights = car.hasHeadlightsTurnedOn();
        if (time.isAfter(LocalTime.of(21, 0)) || time.isBefore(LocalTime.of(5, 0))){
            Assertions.assertTrue(lights);
        }else Assertions.assertFalse(lights);
    }

    @Test
   public void createCar() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("createCar");
        //When
        String type = car.getCarType();
        //Then
        List<String> possibleTypes = Arrays.asList("SUV", "Sedan", "Cabrio");
        Assertions.assertTrue(possibleTypes.contains(type));
    }

    @Test
   public void createCar2() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("createCar2");
        //When
        String type = car.getCarType();
        //Then
        List<String> possibleTypes = Arrays.asList("SUV", "Sedan", "Cabrio");
        Assertions.assertTrue(possibleTypes.contains(type));
    }
}