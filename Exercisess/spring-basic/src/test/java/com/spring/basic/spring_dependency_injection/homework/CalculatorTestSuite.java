package com.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {


    @Test
    public void ShouldAddValue() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double calculate = bean.add(1, 3);
        Assertions.assertEquals(4,calculate);
    }

    @Test
    public void ShouldSubtractValues() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double calculate = bean.subtract(3, 1);
        Assertions.assertEquals(2,calculate);
    }

    @Test
    public void ShouldMultiplyValues() {ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double calculate = bean.multiply(2, 3);
        Assertions.assertEquals(6,calculate);
    }

    @Test
    public void ShouldDivideValue() {ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double calculate = bean.divide(12, 3);
        Assertions.assertEquals(4,calculate);
    }
}