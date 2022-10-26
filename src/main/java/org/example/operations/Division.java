package org.example.operations;

import org.example.operationInterface.CalculatorOperation;

import java.util.Objects;

public class Division implements CalculatorOperation {

    private double left;

    private double right;

    public Division(double left, double right){
        this.left = left;
        this.right = right;
    }

    @Override
    public double operate() throws Exception {
        Objects.requireNonNull(this.left);
        Objects.requireNonNull(this.right);
        if(this.right != 0 ){
            return getLeft() / getRight();
        }

        throw new Exception("No se puede realizar una division por cero");

    }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }
}
