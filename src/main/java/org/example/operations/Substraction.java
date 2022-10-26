package org.example.operations;

import org.example.operationInterface.CalculatorOperation;

public class Substraction implements CalculatorOperation {
    @Override
    public double operate(double left, double right) {
        return left-right;
    }
}
