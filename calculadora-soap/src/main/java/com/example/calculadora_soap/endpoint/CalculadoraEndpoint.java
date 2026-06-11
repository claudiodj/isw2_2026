package com.example.calculadora_soap.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.example.calculadora_soap.generated.CalcularRequest;
import com.example.calculadora_soap.generated.CalcularResponse;
import com.example.calculadora_soap.service.CalculadoraService;

@Endpoint
public class CalculadoraEndpoint {
    
    private static final String NAMESPACE_URI = "http://ejemplo.com/calculadora";
    
    @Autowired
    private CalculadoraService calculadoraService;
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CalcularRequest")
    @ResponsePayload
    public CalcularResponse calcular(@RequestPayload CalcularRequest request) {
        CalcularResponse response = new CalcularResponse();
        
        try {
            double resultado = procesarOperacion(request);
            response.setResultado(resultado);
            response.setMensaje("Operación exitosa");
        } catch (Exception e) {
            response.setResultado(0);
            response.setMensaje("Error: " + e.getMessage());
        }
        
        return response;
    }
    
    private double procesarOperacion(CalcularRequest request) {
        int num1 = request.getNumero1();
        int num2 = request.getNumero2();
        String operacion = request.getOperacion().toLowerCase();
        
        switch (operacion) {
            case "sumar":
            case "suma":
            case "+":
                return calculadoraService.sumar(num1, num2);
            case "restar":
            case "resta":
            case "-":
                return calculadoraService.restar(num1, num2);
            case "multiplicar":
            case "multiplicacion":
            case "*":
                return calculadoraService.multiplicar(num1, num2);
            case "dividir":
            case "division":
            case "/":
                return calculadoraService.dividir(num1, num2);
            case "potencia":
                return calculadoraService.potencia(num1, num2);
            case "raiz":
            case "raizcuadrada":
            case "sqrt":
                return calculadoraService.raizCuadrada(num1);
            default:
                throw new IllegalArgumentException("Operación no válida: " + operacion);
        }
    }
}