package calculatorExercise.mathOperations;

import calculatorExercise.mathOperations.IMathOperation;

import java.util.HashMap;

public class MathOperationFactory {
    HashMap<String, IMathOperation> factory;

    public MathOperationFactory() {
        factory = new HashMap<String, IMathOperation>();
    }

    public IMathOperation getMathOperationByName(String operationName) {
        return factory.get(operationName);
    }
    public void addOperations(String function, IMathOperation operation){
        factory.put(function, operation);
    }
}
