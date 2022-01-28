package pasteBin;

import java.util.Scanner;

public class zadatak11 {
    public static void main(String[] args) {
        //11. Za unete brojeve a i b ispisati veci od njih.

        Scanner sc = new Scanner(System.in);
        System.out.print("Upisite broj x: ");
        int x = sc.nextInt();
        System.out.print("Upisite broj y: ");
        int y = sc.nextInt();

        if (x > y) {
            System.out.println(x+ " je vrednost x i veci je od broja y");
        } else if (y > x){
            System.out.println(y + " je vrednost broja y i veci je od broja x");
        } else {
            System.out.println("Brojevi su jednaki");
        }


    }
}
