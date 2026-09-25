package classes;
import java.util.ArrayList;


public class GestaoPedidos {
    private ArrayList<String> gestaoPedidos;

    public GestaoPedidos(){
        this.gestaoPedidos = new ArrayList<>();
    }

    public void adicionarPedido(String item){
        this.gestaoPedidos.add(item);
    }

    public String proximoPedido(){
        if(this.gestaoPedidos.isEmpty()){
            return "Fila vazia";
        }
        return gestaoPedidos.remove(0);
    }

    public int quantidadePendentes(){
        return gestaoPedidos.size();
    }

    public void listarPedidos(){
        for(String pedido: gestaoPedidos){
            System.out.println(pedido);
        }   
    }
}
