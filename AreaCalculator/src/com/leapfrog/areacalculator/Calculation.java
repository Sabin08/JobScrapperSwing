/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.areacalculator;

/**
 *
 * @author sabin
 */
public class Calculation {
    public double area(double l,double b){
    return l*b;
    }
    public double volume(double l, double b,double h){
    return l*b*h;
    }
    public double volumeofcube(double l){
    double total=1;
    for(int i=1;i<=3;i++){
    total=total*l;
    }
    return total;
    }
    public double areaofcylinder(double r){
    double total2=1;
    for(int i=1;i<=2;i++){
    total2=total2*r;
    }
      return 3.14*total2;  
    }
}
