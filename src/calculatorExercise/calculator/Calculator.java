package calculatorExercise.calculator;

import calculatorExercise.mathOperations.mathOperationInterface.IMathOperation;
import calculatorExercise.mathOperations.factory.MathOperationFactory;

public class Calculator {
    private MathOperationFactory mathOperationFactory;
    private double num1;
    private double num2;

    public Calculator(double num1 , double num2){
        this.num1 = num1;
        this.num2 = num2;
        mathOperationFactory = new MathOperationFactory();
    }
    public void addOperations(String name, IMathOperation operation){
        mathOperationFactory.addOperations(name, operation);
    }
    public double calculate(String operationName){
       return mathOperationFactory.getMathOperationByName(operationName).mathOperation(this.num1, this.num2);
    }
}
