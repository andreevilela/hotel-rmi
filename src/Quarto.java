public class Quarto {

	int tipo;
	String capacidade;
	int quantidade;
	double preco;

	public Quarto(int tipo, String capacidade, int quantidade, double preco) {
		super();
		this.tipo = tipo;
		this.capacidade = capacidade;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "[tipo=" + tipo + ", capacidade=" + capacidade + ", quantidade=" + quantidade + ", preco=" + preco + "]";
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(String capacidade) {
		this.capacidade = capacidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void reservaQuarto() {
		quantidade--;
	}


}
