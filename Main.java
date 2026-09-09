package atividade10;

import java.util.LinkedList;
import java.util.List;

class GerenciadorPedidos {

    public static void executar() {

        List<String> fila = new LinkedList<>();

        ((LinkedList<String>) fila).addFirst("Pedido 1");


        ((LinkedList<String>) fila).addLast("Pedido 99");

        for (String pedido : fila) {
            System.out.println(pedido);
        }
    }
}
// Linkedlist apresenta performance melhor para inserção no início da lista, por exemplo
// pois a sua complexidade é de O(1), pois não se faz necessário o deslocamento dos elementos
// diferentemente do arraylist.