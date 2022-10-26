package org.example.calculator;

import org.example.operationInterface.CalculatorOperation;

import java.security.InvalidParameterException;

public class Calculator {
    public void calculate(CalculatorOperation operation) throws Exception {
        if (operation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }

       double result= operation.operate();
        printResult(result);
    }

    public void printResult(double result){
        System.out.println(result);
    }
}
