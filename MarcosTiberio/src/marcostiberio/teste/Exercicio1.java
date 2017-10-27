/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcostiberio.teste;

public class Exercicio1 {

    public static void main(String[] args) {
        int[] lista = {2, 9, 8, 7, 6, 5, 7, 3};
        int index = 0;
        System.out.println(retornaValorRepetido(lista, index));
    }

    private static int retornaValorRepetido(int[] lista, int index) {
        int indice = 0;
        int retorno = -1;

        if (lista.length > 1 && lista[index] > 1) {
            for (int i = 0; i < lista.length; i++) {
                for (int x = i; x < lista.length; x++) {
                    if ((i != x) && (lista[i] == lista[x])) {
                        if (indice == 0 || indice > x) {
                            indice = x;
                            retorno = lista[i];
                        }
                    }
                }
            }

        } else {
            System.out.println("A liasta tem que ser maior que 1, e o"
                    + " primeiro númerio da lita tem que ser maior que 1 ");
        }
        return retorno;
    }

}
