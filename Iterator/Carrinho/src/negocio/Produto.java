package negocio;

public class Produto {
    private String nomeDoProduto;
	private Double value;

	@Override
	public String toString() {
		return String.format("Nome: %s\tValor: R$ %.2f",nomeDoProduto, value);
	}

	public Produto(String nomeDoProduto, Double value) {
		this.nomeDoProduto = nomeDoProduto;
		this.value = value;
	}

	public String getnomeDoProduto() {
		return nomeDoProduto;
	}
	
	public Double getValue() {
		return value;
	}    
}
