public class KPS {


    public static void main(String[] args) {
        String pelaaja1 = new Scanner(System.in).nextLine();
        String pelaaja2 = new Scanner(System.in).nextLine();

        int voittaja = pelaaKierros(pelaaja1, pelaaja2);

        System.out.println("Pelin voitti pelaaja " + voittaja);
        //System.out.println("Tasapeli?");
    }



}
