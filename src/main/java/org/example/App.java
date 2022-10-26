package org.example;

import org.example.calculator.Calculator;
import org.example.operations.Adittion;
import org.example.operations.Substraction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
         calculator.calculate(new Adittion());
    }
}
