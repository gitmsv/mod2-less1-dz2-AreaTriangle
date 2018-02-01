package ua.jvlab.smlnk.object;

import static java.lang.System.*;

public class Triangle {

    private double sideTr1;
    private double sideTr2;
    private double sideTr3;

    public Triangle (double sideTr1, double sideTr2, double sideTr3) {
        this.sideTr1 = sideTr1;
        this.sideTr2 = sideTr2;
        this.sideTr3 = sideTr3;
    }

    public Triangle () {
    }

    public double getSideTr1() {
        return sideTr1;
    }

    public void setSideTr1(double sideTr1) {
        this.sideTr1 = sideTr1;
    }

    public double getSideTr2() {
        return sideTr2;
    }

    public void setSideTr2(double sideTr2) {
        this.sideTr2 = sideTr2;
    }

    public double getSideTr3() {
        return sideTr3;
    }

    public void setSideTr3 (double sideTr3) {
        this.sideTr3 = sideTr3;
    }


    public double areaTr() {
        double p;
        p = (sideTr1 + sideTr2 + sideTr3) / 2;
        double s = (Math.sqrt(p * (p - sideTr1) * (p - sideTr2) * (p - sideTr3)));
        return s;

    }

}
