package pasteBin;

import java.util.Scanner;

public class zadatak9ZazzBuzz {
    public static void main(String[] args) {
        //9. Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv sa 3,
        // "Buzz" ako je deljiv sa 5, "Zazz" ako je deljiv sa 7 i sve ostale varijacije
        // ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)

        Scanner sc = new Scanner(System.in);
        System.out.print("Upisite broj n: ");
        int n = sc.nextInt();
        for (int x = 1; x <= n; x++) {
            if (x % 3 == 0 && x % 5 == 0 && x % 7 ==0) {
                System.out.println(x + ": FizzBuzzZazz");
            } else if (x % 3 == 0 && x % 5 == 0) {
                System.out.println(x + ": FizzBuzz");
           } else if (x % 3 == 0 && x % 7 ==0) {
                System.out.println(x + ": FizzZazz");
            } else if (x % 5 == 0 && x % 7 ==0) {
                System.out.println(x + ": BuzzZazz");
            } else if (x % 3 == 0) {
                System.out.println(x + ": Fizz");
            } else if (x % 5 == 0) {
                System.out.println(x + ": Buzz");
            } else if (x % 7 ==0) {
                System.out.println(x + ": Zazz");
            } else {
                System.out.println(x + ":");
            }

        }
    }
}
