/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp0050;

import java.util.List;

/**
 *
 * @author Admin
 */
public class SolvingEquationView {

    InputData input = new InputData();

    public void outputEvenOddSquare(List<Double> typeNum, List<Double> solution) {
        String outputOdd = "";
        String outputEven = "";
        String square = "";
        for (Double x : typeNum) {
            if (x % 2 == 0) {
                outputEven += x + ", ";
            } else {
                outputOdd += x + ", ";
            }
            if (input.isSquare(x)) {
                square += x + ", ";
            }
        }
        for (Double x : solution) {
            if (x != null) {
                if (x % 2 == 0) {
                    outputEven += x + ", ";
                } else {
                    outputOdd += x + ", ";
                }
                if (input.isSquare(x)) {
                    square += x + ", ";
                }
            }
        }
        if (outputOdd.length() > 0) {
            System.out.println("Odd Number : " + outputOdd.substring(0, outputOdd.length() - 2));
        }
        if (outputEven.length() > 0) {
            System.out.println("Even Number: " + outputEven.substring(0, outputEven.length() - 2));
        }
        if (square.length() > 0) {
            System.out.println("Square Number: " + square.substring(0, square.length() - 2));
        }
    }
 
    public void outputSuperlative(List<Double> typeNum, List<Double> solution) {
        String solutionn = "";
        if (!solution.isEmpty()) {
            for (Double x : solution) {
                solutionn = x + "";
                if (x == null) {
                    System.out.println("phuong trinh vo nghiem");
                } else {
                    System.out.println("Solution: x = " + x);
                }
            }
        } else {
            System.out.println("phuong trinh vo so nghiem");
        }
        outputEvenOddSquare(typeNum, solution);
    }

    public void outputQuadratic(List<Double> typeNum, List<Double> solution) {
        if (!solution.isEmpty()) {
            for (int i = 0; i < solution.size(); i++) {
                System.out.print(" Solution x" + (i + 1) + " = " + solution.get(i));
            }
        } else if (solution.isEmpty()) {
            System.out.print("phuong trinh vo nghiem");
        }
        System.out.println("");
        outputEvenOddSquare(typeNum, solution);
    }


}
