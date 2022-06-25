package Ex1;

import java.util.Scanner;

/*
 * @author Priscila Butzke
 */
 /*Escreva um algoritmo que leia o código de um aluno e suas três notas. 
Calcule a média ponderada do aluno, considerando que o peso para a maior nota seja 4 e para as duas restantes, 3.
Mostre o código do aluno, suas três notas, a média calculada e uma mensagem "APROVADO" se a média for maior ou igual a 5 
e "REPROVADO" se a média for menor que 5. Repita a operação até que o código lido seja negativo.
(com while ou do while)
 */
public class Ex1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        //p =  mp = media ponderada n = notas
        // media ponderada = nota * peso + nota * peso / soma dos pesos
        int cod, p1, p2, p3;
        double n1, n2, n3, mp;

        System.out.println("Digite o código do aluno:"
                + "\nValor negativo encerra o programa.");
        cod = ler.nextInt();

        while (cod >= 0) {
            System.out.println("Nota 1: ");
            n1 = ler.nextDouble();

            System.out.println("Nota 2: ");
            n2 = ler.nextDouble();

            System.out.println("Nota 3: ");
            n3 = ler.nextDouble();

            if (n1 > n2 && n1 > n3) {
                p1 = 4;
                p2 = 3;
                p3 = 3;
            } else if (n2 > n3) {
                p1 = 3;
                p2 = 4;
                p3 = 3;
            } else {
                p1 = 3;
                p2 = 3;
                p3 = 4;
            }
            mp = (n1 * p1 + n2 * p2 + n3 * p3) / (p1 + p2 + p3);
            if (mp >= 5) {
                System.out.println("Codigo do aluno:" + cod
                        + "\nNota 1: " + n1
                        + "\nNota 2: " + n2
                        + "\nNota 3: " + n3
                        + "\nMédia: " + mp
                        + "\nSituação do aluno: APROVADO");
            } else {
                System.out.println("Codigo do aluno:" + cod
                        + "\nNota 1: " + n1
                        + "\nNota 2: " + n2
                        + "\nNota 3: " + n3
                        + "\nMédia: " + mp
                        + "\nSituação do aluno: REPROVADO");
            }
            System.out.println("Digite o código do aluno:"
                    + "\nValor negativo encerra o programa.");
            cod = ler.nextInt();
        }
    }
}
