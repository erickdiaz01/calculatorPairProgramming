package org.example.calculator;

import org.example.operationInterface.CalculatorOperation;

import java.security.InvalidParameterException;

public class Calculator {
    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
       double result= operation.operate(1,2);
        System.out.println(result);
    }
}
