package pasteBin;

import java.util.Scanner;

public class zadatak5odNdo14 {
    public static void main(String[] args) {
        // 5. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa -14 do i zakljucno sa 2*n.
        Scanner sc = new Scanner(System.in);
        System.out.print("Upisite pozitivan broj n: ");
        int n = sc.nextInt();

        for (int i = -14; i <= n*2; i++) {
            System.out.println(i);
        }

        for (int x = n*2 ; x >= -14; x--) {
            System.out.println(x);
        }


    }
}
