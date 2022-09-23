package negocio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Carrinho implements Iterator {
    List<Produto> produtos = new ArrayList<Produto>();
    int posicao = 0;
	
	
	public Iterator iterator() {
		return new Carrinho();
	}

	public Carrinho (Produto... Produtos) {
		this.produtos = Arrays.asList(Produtos);
	}

    @Override
    public boolean hasNext() {
        if (this.posicao < this.produtos.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {        
        Object objeto = this.produtos.get(posicao);
        posicao++;
        return objeto;
    }

    public void MostraCarrinho(Iterator iterator) {
        while (iterator.hasNext()) {
            Produto produto = (Produto) iterator.next();
            System.out.println(produto.toString());
        }

    }
}
