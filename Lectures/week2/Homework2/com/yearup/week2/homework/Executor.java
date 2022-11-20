package com.yearup.week2.homework;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Executor extends SolarSystemPlanet {
    static Scanner sc = new Scanner(System.in);
    private static SolarSystemPlanet sol = new SolarSystemPlanet();


    public static void main(String[] args) {


        celstialobject.displayCelestialObject();

        Milkyway.displayMilkyway();


        do {
            String planet = getPlanetName();
            double radius = getPlanetRadius();
            // calc area of planet
            Planet plan = new Planet();
            double area = plan.calcArea(radius, radius);

            String star = sol.getStar();
            printStarAndArea(star, area);
            displayPosition(sol.getPosition(planet));

            int numMoons = PlanetName.returnNumMoons(planet);

            displayNumMoons(planet, numMoons);



        } while (promptUserAgain() == true);


        System.out.println("Thanks for using our planet application. Goodbye!");



    }

    public static String getPlanetName() {
        System.out.println("Enter the planet name: ");
        return sc.next();
    }

    public static double getPlanetRadius() {
        System.out.println("Enter the planet radius: ");
        return sc.nextDouble();
    }

    public static void printArea(double r) {
        System.out.println("Area of the planet is: " + r);
    }

    public static void displayPosition(int pos) {
        System.out.println("The position of the planet is: " + pos);
    }

    public static void printStarAndArea(String star, double area) {
        System.out.println("Your planet's star is " + star);
        printArea(area);
    }

    public static boolean promptUserAgain() {

        System.out.println("Do you want to check details for any other planet? yes or no: ");
        String userDecision = sc.next();
        if (userDecision.toLowerCase().equals("yes")) {
            return true;
        }
        return false;
    }



    public static class Milkyway {
        public static void displayMilkyway() {
            System.out.println("Your planet belongs to Milky way galaxy");
        }
    }

    public enum PlanetName {
            MERCURY(0),
            VENUS(0),
            EARTH(1),
            MARS(2),
            JUPITER(80),
            SATURN(83),
            URANUS(27),
            NEPTUNE(14);

            private final int numberOfMoons;

            PlanetName(int numberOfMoons) {
                this.numberOfMoons = numberOfMoons;
            }

            public static int returnNumMoons(String planet) {
                int numMoons = 0;
                for (PlanetName p: PlanetName.values()) {
                    //System.out.println(p);
                    if (planet.equalsIgnoreCase(String.valueOf(p))) {
                        numMoons = p.numberOfMoons;
                    }
                }
                return numMoons;
            }
        }

        public static void displayNumMoons(String planet, int numMoons) {
            System.out.println("The number of moons on " + planet + " is " + numMoons + ".");
        }



    interface CelestialObject {
        void displayCelestialObject();
    }


    static CelestialObject celstialobject = new CelestialObject() {
        @Override
        public void displayCelestialObject() {
            System.out.println("Comet is a celestial object");
        }
    };
}



