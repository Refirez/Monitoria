//questao3 simulado
package main;
import classes.Autor;
import classes.Livro;


public class MainLivro{
    public static void main(String[] args){
        Autor a1 = new Autor("lucin","ibiapinense");
        Livro l1 = new Livro("as cronicas de luci hebert", 2.50,a1);

        l1.exibirDetalhes();
    }
}