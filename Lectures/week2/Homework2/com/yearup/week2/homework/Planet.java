package com.yearup.week2.homework;
import java.util.Scanner;

public class Planet implements Calculator {
    protected String starOfPlanet;
    String getStar() {

        return starOfPlanet;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter planet name: ");
        String planetName = sc.nextLine();
        System.out.println("Enter planet radius: ");
        Double planetRadius = sc.nextDouble();

    }
    @Override
    public double calcArea(double r1, double r2) {
        return 3.14 * r1 * r2;
    }
    @Override
    public double calcSum(double val1, double val2) {

        return val1 + val2;
    }

    @Override
    public double calcVolume(double length, double width, double height) {

        return length * width * height;
    }


}
