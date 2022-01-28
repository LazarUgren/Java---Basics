package vezbanjeZnanje;

public class SumaNeparnih {
    public static void main(String[] args) {
        //Suma neparnih prirodnih brojeva od 1 do 5.

        int suma = 0;
        for (int i = 1; i <=5; i++){
            if (i % 2 == 1) {
                suma = suma + i;
            }
        }
        System.out.println(suma);
    }
}
