package vezbanjeNaCasu.nizovi;

public class nizZadatak5 {
    public static void main(String[] args) {
        //Zadatak 5 - Napraviti niz integera i prikazati koji elementi su deljivi sa 3
        //dodatak: ako nijedan nije deljiv sa 3 dodati "nije deljiv sa 3 ni jedan clan niza"

        int[] niz = {22, 25, 226, 29, 28, 65, 76, 34, 88, 89, 45, 12, -4};
        boolean deljiv = false;    //ako nijedan nije deljiv sa 3, cisto da ima nesto da proveri
        for (int i = 0; i < niz.length; i++){
            if (niz[i] % 3 == 0){
                System.out.println(niz[i]);
                deljiv = true;
            }
        }
        if (deljiv == false) {    //ako boolean ostane false onda nepostoje brojevi deljivi sa 3, ako je true onda su deljivi brojevi vec ispisani
            System.out.println("Nijedan broj nije deljiv sa 3");
        }

    }
}
