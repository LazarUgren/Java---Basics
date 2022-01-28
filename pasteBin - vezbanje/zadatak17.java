package pasteBin;

import java.util.Scanner;

public class zadatak17 {
    public static void main(String[] args) {
        //17. Uneti double konstante a, b, c, a zatim i pozitivan ceo broj n.
        // Zatim se unose n double brojeva jedan po jedan.
        // Cim se unese jedan od tih brojeva, na standardni izlaz (tj. konzola) ispisuje se resenje polinoma: a*x^2 + b*x + c.
        Scanner sc = new Scanner(System.in);

        System.out.print("upisite a: ");
        double a = sc.nextDouble();
        System.out.print("upisite b: ");
        double b = sc.nextDouble();
        System.out.print("upisite c: ");
        double c = sc.nextDouble();

        System.out.print("unesi koliko brojeva hoces da se racuna: ");
        int n = sc.nextInt();
        int i = 0;

        while (i < n) {
            System.out.print("upisite broj x: ");
            double x = sc.nextDouble();
            double polinom = a*(x*x) + b*x + c;
            i++;
            System.out.println("resenje polinoma " + a + " * (x^2) + " + b + " * x + "+ c + " = " + polinom);
        }



    }
}
