package codifont;

import java.util.Scanner;

public class Pr1 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //Declarem les variables
        String s1, s2;
        char c1, c2;

        do {
            System.out.println("Introduix 2 caràcters diferents qualsevol:");
            
            //Introcucció del primer caràcter
                s1 = ent.nextLine();
                if (!s1.isEmpty()) {
                    c1 = s1.charAt(0);
                } else {
                    s1 = " ";
                    c1 = s1.charAt(0);
                }

            //Introducció del següent caràcter
                s2 = ent.nextLine();
                if (!s2.isEmpty()) {
                    c2 = s2.charAt(0);
                } else {
                    s2 = " ";
                    c2 = s2.charAt(0);
                }

            //Mirem si els dos caràcters introduits per l'usuari són iguals o no
            if (c1 != c2) {
                break;
            } else {
                System.out.println("Ho sento, els caràcters han de ser diferents!!");
            }
        } while (true);
    }

}
