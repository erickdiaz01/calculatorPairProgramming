package org.example.operations;

import org.example.operationInterface.CalculatorOperation;

public class Adittion implements CalculatorOperation {

    private double left;
    private double right;

    public Adittion(double left, double right){
        this.left = left;
        this.right = right;
    }

    @Override
    public double operate() {
        return getLeft() + getRight();
    }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }

}
