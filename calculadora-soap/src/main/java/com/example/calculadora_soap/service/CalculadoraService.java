package com.example.calculadora_soap.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    
    public double sumar(int a, int b) {
        return a + b;
    }
    
    public double restar(int a, int b) {
        return a - b;
    }
    
    public double multiplicar(int a, int b) {
        return a * b;
    }
    
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
    
    public double potencia(int a, int b) {
        return Math.pow(a, b);
    }
    
    public double raizCuadrada(int a) {
        if (a < 0) {
            throw new ArithmeticException("No se puede calcular raíz cuadrada de un número negativo");
        }
        return Math.sqrt(a);
    }
}