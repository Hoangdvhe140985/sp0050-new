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
public class Validate {
    
    private final Scanner in = new Scanner(System.in);
    
    //check user input number limit
    public int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(in.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }
    
    //check user input double
    public float getFloat() {
        //loop until user input correct
        while (true) {
            try {
                float result = Float.parseFloat(in.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }

        }
    } 
    
    // chech chính phương
    public boolean isSquare(float number) {
        int temp = (int) Math.sqrt(number);
        if (temp * temp == number) {
            return true;
        } else {
            return false;
        }
    }
}
