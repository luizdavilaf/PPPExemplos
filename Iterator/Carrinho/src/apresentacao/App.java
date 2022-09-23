package apresentacao;
import negocio.*;

public class App {
    public static void main(String[] args) throws Exception {
        Carrinho carrinho = new Carrinho(new Produto("TV", 1000d), new Produto("Sapato", 59.99d), new Produto("Lápis", 0.5d));

        
        carrinho.MostraCarrinho(carrinho);

       
    }
}
