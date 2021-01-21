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
public class SolvingEquation {

    public void superlativeProcess(List<Double> typeNum,
            List<Double> solution, double a, double b) {

        typeNum.add(a);
        typeNum.add(b);
        if (a == 0) {
            if (b == 0) {

            } else {
                solution.add(null);
            }
        } else {
            double x = -b / a;
            solution.add(x);
        }
    }

    public void quadraticProcess(List<Double> typeNum,
            List<Double> solution, Double a, Double b, Double c) {

        typeNum.add(a);
        typeNum.add(b);
        typeNum.add(c);
        if (a != 0) {
            Double deta = b * b - 4 * a * c;
            if (deta > 0) {
                double x1 = (float) ((-b + Math.sqrt(deta)) / (a * 2));
                double x2 = (float) ((-b - Math.sqrt(deta)) / (a * 2));
                solution.add(x1);
                solution.add(x2);
            } else if (deta == 0) {
                double x = -b / (2 * a);
                solution.add(x);
                solution.add(x);
            } else {
                //     solution.add(null);
            }
        } else {
            superlativeProcess(typeNum, solution, b, c);
        }
    }
}
