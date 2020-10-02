import java.util.*;
public class Pokeri {

    public static void main(String[] args) {
        Object[] käsi = new Object[5];

        for(int i=0; i<5; i++) {
            String maa = new Scanner(System.in).nextLine();
            String arvo = new Scanner(System.in).nextLine();

            Object kortti = määritäKortti(maa, arvo);
            käsi[i] = kortti;
        }

        boolean käsiSisältääParin = sisältääParin(käsi);

        System.out.println("Käsi " +
                (käsiSisältääParin ? "sisältää parin" : "ei sisällä paria")
        );
    }

    /**
     *
     *
     */
    public static void määritäKortti (){

    }

    /**
     *
     *
     */
    public static void sisältääParin() {

    }


}
