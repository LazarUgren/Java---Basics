package pasteBin;

import java.util.Scanner;

public class zadatak13 {
    public static void main(String[] args) {
        //13. Ispisati tablicu mnozenja jednocifrenih brojeva (dakle tabela 10x10, 0 u prvom polju, 81 u poslednjem polju)
        Scanner sc = new Scanner(System.in);
        int mnozenje;
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 10; j++){
                mnozenje = i * j;
                System.out.println(mnozenje);

            }
        }


    }
}
