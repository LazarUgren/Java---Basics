package practiceTau;

import java.util.Scanner;

public class SeasonOfTheYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the season of the year: ");
        String season = sc.next();

        System.out.print("Please enter the whole number: ");
        int number = sc.nextInt();

        System.out.print("Please enter an adjective: ");
        String adjective = sc.next();

        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee! :)");


    }
}
