package pasteBin;

import java.util.Scanner;

public class zadatak3od0do0PozitivniBr {
    public static void main(String[] args) {
        //3. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.

        Scanner sc = new Scanner(System.in);
        System.out.print("Upisite pozitivan broj n: ");
        int n = sc.nextInt();


        for (int x = n; x >= 0; x--) {
            System.out.println(x);
        }
        for  (int i = 1; i <= n; i++) {
            System.out.println(i);
        }



    }
}
