import centralizado.Cliente;
import centralizado.LinhaDePedido;
import centralizado.Pedido;
import centralizado.Produto;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto(3500.0); 
        Produto produto2 = new Produto(9000.0); 

        Cliente cliente = new Cliente(10.0);

        LinhaDePedido linha1 = new LinhaDePedido(4, produto1);
        LinhaDePedido linha2 = new LinhaDePedido(2, produto2);

        Pedido pedido = new Pedido(cliente, Arrays.asList(linha1,linha2));

        System.out.println(pedido.calcularPreco());
    }
}
