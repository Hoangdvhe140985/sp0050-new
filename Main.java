/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp0050;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Main {

    public static ArrayList<Double> typeNum = new ArrayList<>();
    public static ArrayList<Double> solution = new ArrayList<>();
    public static InputData input = new InputData();
    public static SolvingEquationView output = new SolvingEquationView();
    public static SolvingEquation process = new SolvingEquation();

    public static void main(String[] args) {

        //loop until user want to exit     
        while (true) {
            displayMenu();
            int choice = input.getInputIntInRange("Enter your choice: ",
                    "Please input in range[1-3]", 1, 3);
            switch (choice) {
                case 1:
                    System.out.println("========Calculate Superlative Equation========");
                    typeNum.clear();
                    solution.clear();
                    double number1 = input.inputNumber("Enter A: ", "must be number");
                    double number2 = input.inputNumber("Enter B: ", "must be number");
                    process.superlativeProcess(typeNum, solution, number1, number2);
                    output.outputSuperlative(typeNum, solution);
                    break;
                case 2:
                    System.out.println("========Calculate Quadratic Equation========");
                    typeNum.clear();
                    solution.clear();
                    number1 = input.inputNumber("Enter A: ", "must be number");
                    number2 = input.inputNumber("Enter B: ", "must be number");
                    double number3 = input.inputNumber("Enter C: ", "must be number");
                    process.quadraticProcess(typeNum, solution, number1, number2, number3);
                    output.outputQuadratic(typeNum, solution);
                    break;
                case 3:
                    return;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("=======Equation program=======");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");        
    }

}
