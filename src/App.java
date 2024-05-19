import arvore.Arvore;
import arvore.No;

public class App {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        No raiz = new No('A');
        No b = new No('B');
        No c = new No('C');
        No d = new No('D');
        No e = new No('E');
        No f = new No('F');
        No g = new No('G');
        No h = new No('H');
        No i = new No('I');
        No j = new No('J');
        No k = new No('K');
        No l = new No('L');
        No m = new No('M');
        No n = new No('N');
        No o = new No('O');
        No p = new No('P');
        No q = new No('Q');
        No r = new No('R');

        raiz.inserirFilho(b);
        raiz.inserirFilho(e);
        raiz.inserirFilho(r);

        b.inserirFilho(c);
        b.inserirFilho(l);

        e.inserirFilho(f);
        e.inserirFilho(n);

        r.inserirFilho(i);
        r.inserirFilho(o);

        c.inserirFilho(d);
        c.inserirFilho(m);

        f.inserirFilho(g);

        i.inserirFilho(j);

        o.inserirFilho(p);
    
        g.inserirFilho(h);

        j.inserirFilho(k);
        j.inserirFilho(q);

        arvore.inserir(raiz);

        char valor = 'K';

        System.out.println("Busca por profundidade");
        No encontradoPorProfundidade = arvore.buscarPorProfundidade(valor);
        if(encontradoPorProfundidade == null) {
            System.out.println("\nNó não encontrado.");        }
        else{
            System.out.println("\ndado: " + encontradoPorProfundidade.dado + " foi encontrado");

        }

        System.out.println("Busca por largura");
        No encontradoPorLargura = arvore.buscarPorLargura(valor);

        if(encontradoPorLargura == null) {
            System.out.println("\nNó não encontrado");

        }
        else {
            System.out.println("\ndado: " + encontradoPorLargura.dado + " foi encontrado");

        }
    }
}
