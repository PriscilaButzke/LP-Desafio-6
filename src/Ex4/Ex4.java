package Ex4;

/*
 * @author Priscila Butzke

Escreva um algoritmo que gere o números de 1000 a 1999 
e escreva aqueles que, divididos por 11, dão resto igual a 5.
Utilizando for.
if( n % == 5)
 */

public class Ex4 {

    public static void main(String[] args) {

        for (int i = 1000; i < 2000; i++) {
            if (i % 11 == 5) {
                System.out.println(i);
            }
        }
    }
}
