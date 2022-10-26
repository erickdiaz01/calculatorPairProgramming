package org.example;

import org.example.calculator.Calculator;
import org.example.operations.Adittion;
import org.example.operations.Division;
import org.example.operations.Multiplication;
import org.example.operations.Substraction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {
        Calculator calculator = new Calculator();
         calculator.calculate(new Multiplication(6,2));
    }
}
