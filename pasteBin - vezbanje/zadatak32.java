package pasteBin;

import java.util.Scanner;

public class zadatak32 {
    public static void main(String[] args) {
        //32. Napisati funkciju koja ispisuje sve neparne brojeve zadatog niza. (Dakle, ova funkcija je void)

        Scanner sc = new Scanner(System.in);
        int[] niz1 = new int[sc.nextInt()];
        for (int i = 0; i < niz1.length; i++){
            niz1[i] = sc.nextInt();
        }
        parni(niz1);
    }

    public static void parni (int[] sljiva){
        for (int i = 0; i < sljiva.length; i++){
            if (sljiva[i] % 2 != 0){
                System.out.println(sljiva[i] + " ");
            }
        }
    }
}
