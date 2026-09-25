public class MainPedidos{
    public static void main(String[] args){
        GestaoPedidos restaurante = new GestaoPedidos();

        restaurante.adicionarPedido("Pizza");
        restaurante.adicionarPedido("Feijoada");
        restaurante.adicionarPedido("Hambúrguer");

        restaurante.proximoPedido();
        restaurante.listarPedidos();
    }
}