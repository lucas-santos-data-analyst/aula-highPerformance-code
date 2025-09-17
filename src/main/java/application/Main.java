package application;

import application.lista.listaSimples;

public class Main {
    public static void main(String[] args) {
        
        //Declaração de vetor
        int[] numeros = new  int[5];

        // Declaração de matriz
        int[][] matriz = new int[5][3];
    
        //Declaração de Lista Simples
        listaSimples lista = new listaSimples();

        lista.adicionar("Primeiro");
        lista.adicionar("Segundo");
        lista.adicionar("Terceiro");
        lista.adicionar("Quarto");
        
        System.out.println(lista);


        lista.remover(4);
        System.out.println(lista);
        
    }
}

