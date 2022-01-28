package pasteBin;

import java.util.Scanner;

public class zadatak12 {
    public static void main(String[] args) {
        //12. Za unete brojeve a, b i c ispisati najmanji od njih
        Scanner sc = new Scanner(System.in);

        System.out.print("Upisite broj a: ");
        int a = sc.nextInt();
        System.out.print("Upisite broj b: ");
        int b = sc.nextInt();
        System.out.print("Upisite broj c: ");
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println(a + " je vrednost broja a, i on je najmanji od svih");
        } else if (b < a && b < c) {
            System.out.println(b + " je vrednost broja b, i on je najmanji od svih");
        } else if (c < a && c < b){
            System.out.println(c + " je vrednost broja c, i on je najmanji od svih");
        } else {
            System.out.println("Brojevi su jednaki");
        }


    }
}
