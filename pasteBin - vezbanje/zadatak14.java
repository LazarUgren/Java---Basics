package pasteBin;

import java.util.Scanner;

public class zadatak14 {
    public static void main(String[] args) {
        //14. Napraviti digitron koji prima double, char, double,
        // gde je char neki od simbola: {+, -, *, /, %, ^} i ispisuje resenje odgovarajuce operacije.
        Scanner sc = new Scanner(System.in);
        System.out.print("Upisite broj a: ");
        int a = sc.nextInt();
        System.out.print("upisite neki od simbola +, -, *, /, %, ^: ");
        char x = sc.next().charAt(0);
        System.out.print("Upisite broj b: ");
        int b= sc.nextInt();

        int c;
        if (x == '+') {
            c = a + b;
            System.out.println(c);
        } else if (x == '-') {
            c = a - b;
            System.out.println(c);
        } else if (x == '*') {
            c = a * b;
            System.out.println(c);
        } else if (x == '/') {
            c = a / b;
            System.out.println(c);
        } else if (x == '%') {
            c = a % b;
            System.out.println(c);
        } else if (x == '^') {
            System.out.println(Math.pow(a, b));
        }



    }
}
