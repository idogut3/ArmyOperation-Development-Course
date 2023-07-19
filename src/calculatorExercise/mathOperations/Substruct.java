package calculatorExercise.mathOperations;

import calculatorExercise.mathOperations.mathOperationInterface.IMathOperation;

public class Substruct implements IMathOperation {

    @Override
    public double mathOperation(double num1 , double num2) {
        return num1 - num2;
    }
}
