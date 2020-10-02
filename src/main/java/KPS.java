import java.util.*;
public class KPS {


    public static void main(String[] args) {
        String pelaaja1 = new Scanner(System.in).nextLine();
        String pelaaja2 = new Scanner(System.in).nextLine();

        int voittaja = pelaaKierros(pelaaja1, pelaaja2);

        System.out.println("Pelin voitti pelaaja " + voittaja);
        //System.out.println("Tasapeli?");
    }

    /**
     * @.pre
     * @.post
     */
    public static int pelaaKierros() {
        //* Metodi vertaa pelaajien syöttämiä sanoja, ja selvittää, kumpi pelaajista voitti
        //* Metodi palauttaa voittaneen pelaajan numeron (1 tai 2)

    }


}
