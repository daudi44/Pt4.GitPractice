package codifont;

import java.util.Scanner;

public class Pr3 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //Declarem les variables
        final String str = "abcdefghij";
        int valor, cont = 0;
        char[][] m;

        //Demanem al usuari l'introducció del enter
        do {
            System.out.println("Introdueix un enter major que 1");
            valor = ent.nextInt();
            if (valor > 1) {
                break;
            } else {
                System.out.println("Ha de ser major que 1!");
            }
        } while (true);

        //Assignem el número de files i columnes a la  matriu amb el valor que ens acaba d'introduir l'usuari
        m = new char[valor][valor];

        //Omplim aquesta matriu amb els valors de la cadena de manera cíclica
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (cont == str.length()) {
                    cont = 0;
                    m[i][j] = str.charAt(cont);
                    cont++;
                } else {
                    m[i][j] = str.charAt(cont);
                    cont++;
                }
            }
        }

        //Reutilitzo una variable anterior per portar la comptabilitat de les files que porto
        cont = 0;
        //Mostrem per pantalla la matriu
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] == str.charAt(0)) {
                    System.out.format("%n%d -", cont);
                    for (int k = 0; k < m.length; k++) {
                        System.out.format("%2c", m[i][k]);
                    }
                }
            }
            cont++;
        }
        System.out.println("");
    }
}
