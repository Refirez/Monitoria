package classes;
public class Livro{
    private String titulo;
    private double preco;
    private Autor autor;

    public Livro(String titulo, double preco, Autor autor){
        this.titulo = titulo;
        this.preco = preco;
        this.autor = autor;
    }

    public void exibirDetalhes(){
        System.out.println(this.titulo);
        System.out.println(this.autor.nome);
        System.out.println(this.preco);
    }

}