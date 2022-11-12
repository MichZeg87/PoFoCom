//package com.kodilla.spring.basic.spring_dependency_injection;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//public class SimpleApplication2TestSuite {
//    @Test
//    public void shouldReturnCorrectMessage() {
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic"); // [1]
//        SkypeMessageService bean = context.getBean(SkypeMessageService.class);
//        String message = bean.send("Test", "Any receiver");
//        Assertions.assertNotNull(message);
//    }
//
//    @Test
//    public void shouldProcessMessage2() {
//        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
//        SimpleApplication2 bean = context.getBean(SimpleApplication2.class);
//        String message = bean.processMessage("Test", "Any receiver");
//        Assertions.assertEquals("Sending [Test] to: Any receiver using Skype", message);
//    }
//
//}
