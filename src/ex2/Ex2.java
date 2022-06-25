package ex2;

import java.util.Scanner;

/*
 * @author Priscila Butzke
 */
 /*
Escrever um algoritmo que leia uma quantidade desconhecida de números e 
conte quantos deles estão nos seguintes intervalos: [0..25], [26..50], [51..75] e [76..100]. 
A entrada de dados deve terminar quando for lido um número negativo.
(com while ou do while)
 */
public class Ex2 {

    public static void main(String[] args) {
        int n = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número:"
                + "\nValor negativo encerra o programa.");
        n = ler.nextInt();

        while (n >= 0 && n <= 100) { // n° negativo sai do loop

            if (n >= 0 && n <= 25) { //1° intervalo
                c1++;
            } else if (n > 25 && n <= 50) {
                c2++;
            } else if (n > 50 && n <= 75) {
                c3++;
            } else{
                c4++;
            }
            System.out.println("Digite outro n°: ");
            n = ler.nextInt();
        }
        System.out.println("Intervalos e quantidade de números:"
                + "\n0 a 25: " + c1
                + "\n26 a 50: " + c2
                + "\n51 a 75: " + c3
                + "\n76 a 100: " + c4);
    }
}
