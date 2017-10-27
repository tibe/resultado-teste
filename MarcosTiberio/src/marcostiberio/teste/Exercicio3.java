/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marcostiberio.teste;

import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

    public static void main(String[] args) {
        int k = 7;
        List<Integer> lista = new ArrayList<Integer>();
      
        lista.add(1);
        lista.add(4);
        lista.add(9);
 

        if (!lista.isEmpty()) {
            System.out.println("Lista original:   " + lista.toString());
            lista.remove((Object) k);
            System.out.println("Lista Modificada: " + lista.toString());
        } else {
            System.out.println("A lista não pode ser vazia. ");
        }

    }
}
