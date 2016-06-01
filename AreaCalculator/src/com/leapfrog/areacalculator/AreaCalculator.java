/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.areacalculator;

import java.util.Scanner;

/**
 *
 * @author sabin
 */
public class AreaCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            Calculation calc = new Calculation();
            System.out.println("enter length:");
            double l = scan.nextDouble();
            System.out.println("enter breadth:");
            double b = scan.nextDouble();
            System.out.println("enter height:");
            double h = scan.nextDouble();
            System.out.println("enter radius:");
            double r = scan.nextDouble();
            System.out.println("1.area");
            System.out.println("2.volume");
            System.out.println("3.volume of cube");
            System.out.println("4.area of cylinder");
            System.out.println("5.exit");
            System.out.println("enter your choice[1-5]: ");
            int choice = scan.nextInt();
            double total3 = 0;
            switch (choice) {
                case 1:
                    total3 = calc.area(l, b);
                    break;
                case 2:
                    total3 = calc.volume(l, b, h);
                    break;
                case 3:
                    total3 = calc.volumeofcube(l);
                    break;
                case 4:
                    total3 = calc.areaofcylinder(r);
                    break;
                case 5:
                    System.exit(2);
                    break;

            }
            System.out.println("total calculation is" + total3);
        }

    }

}
