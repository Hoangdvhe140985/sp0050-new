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

    public static ArrayList<Float> typeNum = new ArrayList<>();
    public static ArrayList<Float> solution = new ArrayList<>();
    public static Validate v = new Validate();
    public static SolvingEquationView sev = new SolvingEquationView();
    public static SolvingEquation se = new SolvingEquation();

    public static void main(String[] args) {

        //loop until user want to exit     
        while (true) {
            sev.menu();
            int choice = v.checkInputIntLimit(0, 3);
            switch (choice) {
                case 1:
                    inputSuperlative(typeNum, solution);
                    sev.outputSuperlative(typeNum, solution);
                    break;
                case 2:
                    inputQuadratic(typeNum, solution);
                    sev.outputQuadratic(typeNum, solution);
                    break;
                case 3:
                    return;
            }
        }
    }

    public static void inputSuperlative(List<Float> typeNum, List<Float> solution) {
        typeNum.clear();
        solution.clear();
        System.out.println("========Calculate Superlative Equation========");
        System.out.print("Enter A: ");
        float a = v.getFloat();
        System.out.print("Enter B: ");
        float b = v.getFloat();
        se.superlativeProcess(typeNum, solution, a, b);
    }

    public static void inputQuadratic(List<Float> typeNum, List<Float> solution) {
        typeNum.clear();
        solution.clear();
        System.out.println("========Calculate Quadratic Equation========");
        System.out.print("Enter A: ");
        float a = v.getFloat();
        System.out.print("Enter B: ");
        float b = v.getFloat();
        System.out.print("Enter C: ");
        float c = v.getFloat();
        se.quadraticProcess(typeNum, solution, a, b, c);
    }
}
