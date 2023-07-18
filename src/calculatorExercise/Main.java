package calculatorExercise;

import calculatorExercise.mathOperations.Add;
import calculatorExercise.mathOperations.Substruct;
import calculatorExercise.calculator.Calculator;

import java.util.Scanner;

public class Main {

    public static void printInstructions(){
        System.out.println("Hello this is your calculator please enter 2 numbers :\n");
        System.out.println("And then please enter the function you want to calculate");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        printInstructions();
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        String function = scan.next();


        Calculator calculator = new Calculator(num1, num2);
        calculator.addOperations("add", new Add());
        calculator.addOperations("substruct", new Substruct());


        System.out.println(calculator.calculate(function));



    }
}
