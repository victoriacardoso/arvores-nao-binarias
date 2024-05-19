package arvore;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class No {
    public char dado;
    public ArrayList<No> filhos;

    public No(char dado) {
        this.dado = dado;
        filhos = new ArrayList<>();
    }

    public void inserirFilho(No no) {
        filhos.add(no);
    }

    public boolean isFolha() {
        return filhos.isEmpty();
    }

    public No buscarPorProfundidade(char valor) {
        System.out.print(dado + " - ");
        if (dado == valor) {
            return this;
        }

        for (No no : filhos) {
            No encontrado = no.buscarPorProfundidade(valor);
            if (encontrado != null) {
                return encontrado;
            }
        }
        return null;

    }

    public No buscarPorLargura(char valor) {
        Queue <No> fila = new LinkedList<>();
        
        fila.add(this);
       
        while(!fila.isEmpty()) {
            No atual = fila.poll();
            System.out.print(atual.dado + " - ");
            if (atual.dado == valor) {
                return atual;
            }

            for (No filho : atual.filhos) {
                fila.add(filho);
            }

        }
        return null;


    }

}
