package org.example.operations;

import org.example.operationInterface.CalculatorOperation;

public class Adittion implements CalculatorOperation {

    @Override
    public double operate(double left, double right) {
        return left+right;
    }
}
