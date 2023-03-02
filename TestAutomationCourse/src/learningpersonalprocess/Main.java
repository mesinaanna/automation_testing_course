package learningpersonalprocess;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String name = "Anna";
        String result = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            result = result + name.toLowerCase().charAt(i);
        }
        System.out.println("Initial input: " + name);
        System.out.println(result);

        if (name.toLowerCase().equals(result)) {
            System.out.println("String:[" + name + "] is palindrom");
        } else {
            System.out.println("String:[" + name + "] is NOT palindrom");
        }



    }

    public static String getNumberForContact(String contactName) {
        String result;
        if (contactName.equals("Mircea")) {
            result = "067571099";
        } else if (contactName.equals("Anishoara")) {
            result = "060350820";
        } else {
            result = "unknown contact";
        }
        return result;
    }
}

class Flower {

    private String color;
    public String name;

    public static int nrOfPetals = 20;

    //default constructor
    private Flower() {

    }

    private Flower(String color) {
        color = color;
    }

    public String getName() {
        return name;
    }

    //method
    String getColor() {
        return color;
    }

    void setColor(String color) {
        color = color;
    }


    void blossom() {
        System.out.println("Flower with color " + this.color + " blossoms");
    }

    /**
     * Please provide name and color like in this example: redRose, yellowCrisantema
     *
     * @param name
     * @param color
     * @return
     */
    public static Flower createAFlower(String name, String color) {
        Flower newFlower = new Flower();
        newFlower.name = color + name;
        return newFlower;
    }
}



