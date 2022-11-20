package com.yearup.week2.homework;
import  java.util.Scanner;
class Square implements Calculator {

    public double calcArea(double r1, double r2) {
        return r1 * r2;
    }
    public double calcSum(double val1, double val2) {
        return val1 + val2;
    }
    public double calcVolume(double val1, double val2, double val3) {
        return val1 * val2 * val3;
    }
    static double getUserInputLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of your square: ");
        return sc.nextDouble();
    }
    static void displayArea(double area) {
        System.out.println("The area of this square is: " + area);

    }

    public static void main(String[] args) {
        Square a = new Square();
        double squareLen = getUserInputLength();
        double area = a.calcArea(squareLen, squareLen);
        displayArea(area);


    }
}
