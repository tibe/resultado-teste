/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcostiberio.teste;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a quantia de degraus da escada: ");

        int qtnDegral = teclado.nextInt();
        if (qtnDegral <= 2) {
            System.out.println("A escada tem que ser mair que 2 degral ");
            return;
        }
        String espaco = "%" + qtnDegral + "s";
        String degral = "";

        for (int i = 0; i < qtnDegral; i++) {
            degral = degral + "#";
            System.out.println(String.format(espaco, degral));

        }

    }

}
