package com.yearup.week2.homework;

//import main.java.com.yearup.week2.homework.HW2.src.com.yearup.week2.homework.Planet;

public class SolarSystemPlanet extends Planet {
    // Create a variable to store the star of the Solar system and set it to “SUN”.
    // This value shouldn’t be modified by any other class.
    private String star = "SUN";

    public String getStar() {
        return star;
    }

    public int getPosition(String planetName) {
        planetName = planetName.toLowerCase();
        int position = 0;
        switch (planetName) {
            case "mercury":
                position = 1;
                break;
            case "venus":
                position = 2;
                break;
            case "earth":
                position = 3;
                break;
            case "mars":
                position = 4;
                break;
            case "jupiter":
                position = 5;
                break;
            case "saturn":
                position = 6;
                break;
            case "uranus":
                position = 7;
                break;
            case "neptune":
                position = 8;
                break;
            default:
                position = -1;
        }
        return position;
    }

}
