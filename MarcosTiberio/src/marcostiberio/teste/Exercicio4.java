package marcostiberio.teste;

import java.util.Scanner;

public class Exercicio4 {

    static String vlTroco = "";

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual e o valor do troco? ");
        Integer troco = teclado.nextInt();

        if (troco > 0) {
            System.out.println("O troco deve ser em notas de:" + troco(troco));
        } else {
            System.out.println("O valor informado  não pode ser valor negativo.");
        }
    }

    private static String troco(int troco) {
        if (troco == 0) {
            return vlTroco;
        } else if (troco >= 50) {
            vlTroco += " R$50 ";
            return troco(troco - 50);
        } else if (troco >= 20) {
            vlTroco += " R$20 ";
            return troco(troco - 20);
        } else if (troco >= 10) {
            vlTroco += " R$10 ";
            return troco(troco - 10);
        } else if (troco >= 5) {
            vlTroco += " R$5 ";
            return troco(troco - 5);
        } else if (troco >= 2) {
            vlTroco += " R$2 ";
            return troco(troco - 2);
        }
        return vlTroco;

    }
}
