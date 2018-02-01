package ua.jvlab.smlnk;

import ua.jvlab.smlnk.object.Triangle;

public class Main {

    public static void main(String[] args) {

        Triangle tr1 = new Triangle(5.0,10.2,11.3);
        double ar = tr1.areaTr();
        System.out.println("Aria of tr1 = "+ar+" sm"+"\n");

        Triangle tr2 = new Triangle();
        tr2.setSideTr1(19.5);
        tr2.setSideTr2(17.5);
        tr2.setSideTr3(11.5);
        double ar1 = tr2.areaTr();
        System.out.println("Aria of tr2 = "+ar1+" sm");
    }
}
