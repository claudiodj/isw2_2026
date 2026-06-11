package com.example.calculadora_soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraSoapApplication {
    public static void main(String[] args) {
        System.out.println("http://localhost:8085/ws/calculadora.wsdl");
        SpringApplication.run(CalculadoraSoapApplication.class, args);
    }
}