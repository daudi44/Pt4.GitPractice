package codifont;

public class Pr2 {

    public static void main(String[] args) {
        //Inicialitzem els dos caràcters constants
        final char ch1 = 'a', ch2 = 'e';
        String cadena = "";

        
        //Mirem quina de les dues constants és més gran
        if (ch1 > ch2) {
            for (int i = ch1; i >= ch2; i--) {
                cadena += (char) i;
            }
            System.out.println("La cadena generada és:");
            System.out.format("%n%s%n", cadena);
        } else {
            for (int i = ch1; i <= ch2; i++) {
                cadena += (char) i;
            }
            System.out.println("La cadena generada és:");
            System.out.format("%n%s%n%nel caràcter inicial és '%c' i el final '%c'%n", cadena, ch1, ch2);
        }
    }
}
