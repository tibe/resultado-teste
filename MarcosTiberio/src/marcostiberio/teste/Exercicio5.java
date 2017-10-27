/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcostiberio.teste;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra ou Frase ");
        String palavra = teclado.next();
        System.out.println("Digite uma palvra que  deseja encontrar a Ocorrência na frase: ");
        String ocorrencia = teclado.next();

        if (!palavra.isEmpty()) {
            System.out.println("A string '" + ocorrencia + "' foi encontrada "
                    + ocorrencia(palavra, ocorrencia) + " vez(es) na palavra.");
        } else {
            System.out.println("Informações inválidas!");
        }
    }

    public static int ocorrencia(String palavra, String ocorrencia) {
        int x  = -1;
        int cont = 0;
        while (true) {
            x  = palavra.indexOf(ocorrencia, x  + 1);
            if (x  < 0) {
                break;
            }
            cont++;
        }
        return cont;
    }
}
