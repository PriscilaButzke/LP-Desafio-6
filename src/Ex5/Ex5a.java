package Ex5;

import java.util.Scanner;

/**
 * @author Priscila Butzke
 */
/*
Escreva um algoritmo que leia 500 valores inteiros e positivos e: 
encontre o maior valor; 
encontre o menor valor; 
calcule a média dos números lidos.
Utilizando for. */
public class Ex5a {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int num = 0, c = 0, maior = -99999, menor = 9999999, ac = 0;

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite o número: ");
            num = ler.nextInt();

            ac += num;

            if (num < menor) {
                menor = num;
            }if (num > maior) {
                maior = num;
            }
            c++;
        }
        System.out.println("Total de n° digitados: " + c
                + "\nMaior n°: " + maior
                + "\nMenor n°: " + menor
                + "\nMedia: " + (ac / c));
    }
}
