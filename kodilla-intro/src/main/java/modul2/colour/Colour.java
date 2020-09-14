package modul2.colour;

import java.util.Scanner;

public class Colour {

    public String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Provide first char of your favourite modul2.colour:");
            String colour = scanner.nextLine().trim().toLowerCase();
            switch (colour) {
                case "a":
                    return "Azure";
                case "b":
                    return "Baby blue";
                case "c":
                    return "Cobalt blue";
                case "d":
                    return "Dirty brown";
                case "e":
                    return "Ecru";
                case "f":
                    return "Fire engine red";
                case "g":
                    return "Grey";
                case "h":
                    return "Hunter green";
                case "i":
                    return "Indygo";
                case "j":
                    return "Jungle green";
                case "k":
                    return "Khaki";
                case "l":
                    return "Lavender";
                case "m":
                    return "Maroon";
                case "n":
                    return "Navy Blue";
                case "o":
                    return "Orange";
                case "p":
                    return "Purple";
                case "r":
                    return "Red";
                case "s":
                    return "Silver";
                case "t":
                    return "Turquoise";
                case "u":
                    return "United Nations blue";
                case "y":
                    return "Yellow";
                case "w":
                    return "White";
                case "v":
                    return "Violet";
                default:
                    System.out.println("Please type another char. There is no modul2.colour starts with " + colour);
            }
        }
    }

    public static void main(String[] args) {
        Colour colour = new Colour();
        String result = colour.getUserSelection();
        System.out.println(result);
    }


}
