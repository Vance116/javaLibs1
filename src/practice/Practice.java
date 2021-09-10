/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;

/**
 *
 * @author avance
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1, num2, x1 = 3;

        double answer;

        num1 = 5;

        num2 = x1;

        answer = num2 / num1;

        System.out.println("Hello! What is your name?");
        String firstName1 = sc.next();

        System.out.println("Awesome, " + firstName1 + ", what is your"
                + " favorite color?");
        String favColor1 = sc.next();

        System.out.println(favColor1 + "? Good Choice! Now, whats your "
                + "favoite animal?");
        String favAnimal1 = sc.next();

        System.out.println("Now, give me a city name!");
        String city1 = sc.next();

        System.out.println("Now give me some emotions, First one!");
        String emotion1 = sc.next();

        System.out.println("Second emotion!");
        String emotion2 = sc.next();

        System.out.println("One more!");
        String emotion3 = sc.next();

        System.out.println("Give me a name! (Can be anything)");
        String firstName2 = sc.next();

        System.out.println("What is your goto weapon (can be anything)");
        String weapon1 = sc.next();

        System.out.println("Where are you from?");
        String home1 = sc.next();

        System.out.println("Give me a number");
        int x = sc.nextByte();

        System.out.println("One more number!");
        int y = sc.nextByte();

        System.out.println("What is a name that you do not like");
        String badName1 = sc.next();

        System.out.println("The year is 2088, " + firstName1 + " is looking"
        + " to conquer " + city1 + ". Sporting his " + favColor1 + ""
        + " armor that is made from the finest silk and wielding"
        + " the " + weapon1 + " of " + home1 + ". Which"
        + " is said to be only held by the mightiest of"
        + " warriors! As " + firstName1 + " rode into battle on his"
        + " noble steed, known as " + firstName2 + ". The " + favAnimal1 + " is"
        + " well known as THE BRINGER OF DEATH! As the pair advanced into the "
        + "heart of " + city1 + ". " + firstName1 + " quickly realized that "
        + "this battle would not be as easy as they initially assumed. As "
        + "waves of enemies grew increasingly more difficult and with his "
        + "only allie in the battle," + firstName2 + ", being swarmed and struck "
        + "down in front of " + firstName1 + "'s eyes! This "
        + "enraged " + firstName1 + ", bringing a strength to " + firstName1
        + " That was never before thought possible! They stroke down every"
        + " enemy in sight until his true enemy " + badName1 + ""
        + " appearead! The enemy was"
        + " repulsive and was scarred from years of fighting,"
        + " SUDDENLY " + badName1 + " runs at " + firstName1 + " fueled "
        + "by the anger of his bestfriend and noble steed, " + firstName1
        + " was able to block the attack and counter... Their "
        + "battle lasted " + x + " days and " + y + " nights,"
        + "All of the sudden, both of them drop to their knees overwhelmed "
        + "with feelings of " + emotion1 + ", " + emotion2 + ", "
        + "and " + emotion3 + " as " + badName1 + "swung their weapon just "
        + "missing " + firstName1 + " by " + answer + "millimeters!"
        + firstName1 + " ended the battle with a quick strike, deafeating"
        + "their oopenent," + badName1 + "...");

    }

}
