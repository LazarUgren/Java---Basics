package pasteBin;

import java.util.Scanner;

public class zadatak4od0do0NegativniBrojevi {
    public static void main(String[] args) {
        // 4. Za unet negativan ceo broj n, ispisati sve brojeve od n do  0.

        Scanner sc = new Scanner(System.in);
        System.out.print("Upisite negativan broj n: ");
        int n = sc.nextInt();

        for (int i = n; i <= 0; i++) {
            System.out.println(i);
        }
        for (int d = 0; n <= d; d--) {
            System.out.println(d);
        }

    }
}
