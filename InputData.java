/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sp0050;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class InputData {

    private final Scanner in = new Scanner(System.in);

    //check user input number limit
    public int getInputIntInRange(String msg, String err, int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                System.out.print(msg);
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println(err);
            }
        }
    }

    public double getInputDouble(String msg, String err) {
        //loop until user input correct
        while (true) {
            try {
                System.out.print(msg);
                double r = Double.parseDouble(in.nextLine().trim());
                return r;
            } catch (NumberFormatException e) {
                System.err.println(err);
            }
        }
    }

    // chech chính phương
    public boolean isSquare(Double number) {
        int temp = (int) Math.sqrt(number);
        if (temp * temp == number) {
            return true;
        } else {
            return false;
        }
    }
    
    //input number
    public double inputNumber(String msg) {
        double number = getInputDouble(msg,"Must be number");
        return number;
    }
}
