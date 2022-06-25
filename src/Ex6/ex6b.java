
package Ex6;

import java.util.Scanner;

/**
 *
 * @author Priscila Butzke
 Escrever um algoritmo que leia N, inteiro e positivo, e calcule e mostre o termo de ordem N da sucessão abaixo:
entrada: 8

	ordem:	 1	2	3	4	 5	 6	 7	 8
	termo:	-1	0	5	6	11	12	17	18
Utilizando for.

Logica: quando for impar incrementa em 5 e quando for par incrementa em 1*/
public class ex6b {

    public static void main(String[] args) {
        int c =1,o,t=-1;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o n° da ordem");
        o = ler.nextInt();
        
        for (c = 1; c <= o; c++) {
            System.out.println("Ordem: " + c + " Termo:" +t);
            
            if(c%2 !=0){
                t++;
            }else{
                t+=5;
            }
        }
    }
}
