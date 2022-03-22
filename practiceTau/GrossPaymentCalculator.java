package practiceTau;

import java.util.Scanner;

public class GrossPaymentCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter how much hours employee works a month: ");
        int hours = sc.nextInt();

        System.out.print("Employees payrate: ");
        double rate = sc.nextDouble();

        double gross = hours * rate;

        System.out.print("Montly payrate of the employee is " + gross + "$");

    }
}
