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
    public static int pelaaKierros(String pelaaja1, String pelaaja2) {
        //* Metodi vertaa pelaajien syöttämiä sanoja, ja selvittää, kumpi pelaajista voitti
        //* Metodi palauttaa voittaneen pelaajan numeron (1 tai 2)
        switch (pelaaja1){
            case "kivi":
                if (pelaaja2.equals("kivi")) {
                    return 0;
                } else if(pelaaja2.equals("paperi")){
                    return 2;
                }else{
                    return 1;
                }
            case "paperi":
                if (pelaaja2.equals("paperi")) {
                    return 0;
                } else if(pelaaja2.equals("sakset")){
                    return 2;
                }else{
                    return 1;
                }
            case "sakset":
                if (pelaaja2.equals("sakset")) {
                    return 0;
                } else if(pelaaja2.equals("kivi")){
                    return 2;
                }else{
                    return 1;
                }
            default:
                System.out.println("Syötä 'kivi', 'paperi' tai 'sakset'.");
        }
    }


}
