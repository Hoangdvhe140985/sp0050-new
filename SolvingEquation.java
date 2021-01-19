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

    public void superlativeProcess(List<Float> typeNum,
            List<Float> solution, float a, float b) {

        typeNum.add(a);
        typeNum.add(b);
        if (a == 0) {
            if (b == 0) {

            } else {
                solution.add(null);
            }
        } else {
            float x = -b / a;
            solution.add(x);
        }
    }

    public void quadraticProcess(List<Float> typeNum,
            List<Float> solution, float a, float b, float c) {

        typeNum.add(a);
        typeNum.add(b);
        typeNum.add(c);
        if (a != 0) {
            float deta = b * b - 4 * a * c;
            if (deta > 0) {
                float x1 = (float) ((-b + Math.sqrt(deta)) / (a * 2));
                float x2 = (float) ((-b - Math.sqrt(deta)) / (a * 2));
                solution.add(x1);
                solution.add(x2);
            } else if (deta == 0) {
                float x = -b / (2 * a);
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
