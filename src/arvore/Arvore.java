package arvore;

public class Arvore {
    No raiz;

    public void inserir(No no) {
        if(raiz == null) {
            raiz = no;
            return;
        }
        raiz.filhos.add(no);

    }
    public No buscarPorProfundidade(char valor) {
        if (raiz == null) {
            throw new RuntimeException("Não há nenhum nó com o valor " + valor);
        }
        return raiz.buscarPorProfundidade(valor);
    }
    public No buscarPorLargura(char valor) {
        if (raiz == null) {
           System.out.println("Não há nenhum nó com o valor " + valor);
        }
        return raiz.buscarPorLargura(valor);
    }
}
