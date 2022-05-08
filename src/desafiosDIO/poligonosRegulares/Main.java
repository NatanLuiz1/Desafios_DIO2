//Desafio
//Na geometria Euclidiana, um polígono regular é um polígono em que todos os ângulos são iguais e todos os lados
//tem o mesmo comprimento. Um polígono simples é aquele cujos segmentos de reta não se interceptam.
//Você deve escrever um programa que, dados o número e o comprimento dos lados de um polígono regular,
//mostre seu perímetro.

//Entrada
//A entrada tem dois inteiros positivos: N e L, que são, respectivamente, o número de lados e o comprimento de
//cada lado de um polígono regular (3 ≤ N ≤ 1000000 and 1 ≤ L ≤ 4000).
//
//Saída
//A saída é o perímetro P do polígono regular em uma única linha.


package desafiosDIO.poligonosRegulares;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String N = scan.nextLine();
        String[] numerosSplit = N.split(" ");
        int P = Integer.parseInt(numerosSplit[0])*Integer.parseInt(numerosSplit[1]);

        System.out.println(P);
    }
}
