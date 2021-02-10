package codifont;

import java.util.Scanner;

public class Domjudge {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        //Declaració de totes les variables
        String s1, s2;
        char c1, c2;
        String cadena = "";
        int valor, cont = 0;
        char[][] m;

        //PR1
        do {
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
            }
        } while (true);

        //PR2
        //Mirem quina de les dues constants és més gran
        if (c1 > c2) {
            for (int i = c1; i >= c2; i--) {
                cadena += (char) i;
            }
            System.out.format("%s%n", cadena);
        } else {
            for (int i = c1; i <= c2; i++) {
                cadena += (char) i;
            }
            System.out.format("%s%n", cadena);
        }
        
        //PR3
        //Demanem al usuari l'introducció del enter
        do {
            valor = ent.nextInt();
            if (valor > 1) {
                break;
            } 
        } while (true);

        //Assignem el número de files i columnes a la  matriu amb el valor que ens acaba d'introduir l'usuari
        m = new char[valor][valor];

        //Omplim aquesta matriu amb els valors de la cadena de manera cíclica
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (cont == cadena.length()) {
                    cont = 0;
                    m[i][j] = cadena.charAt(cont);
                    cont++;
                } else {
                    m[i][j] = cadena.charAt(cont);
                    cont++;
                }
            }
        }

        //Reutilitzo una variable anterior per portar la comptabilitat de les files que porto
        cont = 0;
        //Mostrem per pantalla la matriu
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (m[i][j] == cadena.charAt(0)) {
                    System.out.format("%n%d -", cont);
                    for (int k = 0; k < m.length; k++) {
                        System.out.format("%2c", m[i][k]);
                    }
                }
            }
            cont++;
        }
    }
}
