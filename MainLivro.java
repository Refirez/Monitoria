public class MainLivro{
    public static void main(String[] args){
        Autor a1 = new Autor("lucin","ibiapinense");
        Livro l1 = new Livro("as cronicas de luci gay", 2.50,a1);

        l1.exibirDetalhes();
    }
}