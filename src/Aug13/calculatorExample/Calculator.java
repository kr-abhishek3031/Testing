package Aug13.calculatorExample;

import java.security.InvalidParameterException;

public class Calculator {

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }

        operation.perform();
    }

    public static void main(String[] args) {
        Calculator newCalculator = new Calculator();

        Addition ad = new Addition(1, 2);
        newCalculator.calculate(ad);
        Division d = new Division(1, 2);
        newCalculator.calculate(d);
    }

    public void badCalculator(String operation){
        if(operation.equals("add")){
            //add call
        }
        else if(operation.equals("substract")){
            //do subtract
        }
        else if(operation.equals("division")){
            //do subtract
        }
        else{

        }

    }
}
