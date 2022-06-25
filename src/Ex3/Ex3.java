package Ex3;

import java.util.Scanner;

/**
 * @author Priscila Butzke
 */
/*Faça um programa que leia uma série não determinada de dois valores.
O primeiro valor é um código que significa:  (1) débito, (2) crédito e (0) fim.
O segundo valor é uma quantia numérica real. 
O programa deve identificar o código e se for 1, somar a quantia em um acumulador de débitos; 
se for 2, somar a quantia em um acumulador de créditos; se for 0, encerrar o programa. 
Ao final, mostre o total de débitos e créditos e o saldo (saldo  ←  créditos – débitos).
 */
public class Ex3 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double valor = 0, debito = 0, credito = 0;
        int cod = 3;

        while (cod != 0) {
            System.out.println("Caixa de valores:"
                    + "\nDigite conforme tabela:"
                    + "\n1: Débito"
                    + "\n2: Crédito"
                    + "\n0: Fim");
            cod = ler.nextInt();

            switch (cod) {
                case 1:
                    System.out.println("Digite o valor: ");
                    valor = ler.nextDouble();

                    debito += valor; 
                    break;
                case 2:
                    System.out.println("Digite o valor: ");
                    valor = ler.nextDouble();

                    credito += valor;
                    break;
                default:
                    System.out.println("Codigo digitado inválido.");
                    break;
            }
        }
        System.out.println("Extrato:"
                + "\nCréditos: R$ " + credito
                + "\nDébitos: - R$ " + debito
                + "\nSaldo: R$ " + (credito - debito));
    }
}
