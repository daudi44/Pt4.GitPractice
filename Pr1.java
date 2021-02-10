package codifont;

import java.util.Scanner;

public class Pr1 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        String s1, s2;
        char c1, c2;

        do {
            System.out.println("Introduix 2 caràcters diferents qualsevol:");
            
                s1 = ent.nextLine();
                if (!s1.isEmpty()) {
                    c1 = s1.charAt(0);
                } else {
                    s1 = " ";
                    c1 = s1.charAt(0);
                }

                s2 = ent.nextLine();
                if (!s2.isEmpty()) {
                    c2 = s2.charAt(0);
                } else {
                    s2 = " ";
                    c2 = s2.charAt(0);
                }

            if (c1 != c2) {
                break;
            } else {
                System.out.println("Ho sento, els caràcters han de ser diferents!!");
            }
        } while (true);
    }

}
