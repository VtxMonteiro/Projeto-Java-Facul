package classe;

public class Produto {

	private String nome;
	private String marca;
	private String validade;
	private String fabricante;
	private double valor;
	private Fornecedor fornecedor;
	

	public Produto() {
	}



	public Produto(String nome, String marca, String validade, String fabricante, double valor, Fornecedor fornecedor) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.validade = validade;
		this.fabricante = fabricante;
		this.valor = valor;
		this.fornecedor = fornecedor;
	}



	@Override
	public String toString() {
		return "Produtos nome: " 
	+ nome + ", marca: " + marca 
	+ ", validade: " + validade 
	+ ", fabricante: " + fabricante
	+ ", valor: " + valor + ", fornecedor: " + fornecedor 
	+ "";
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getValidade() {
		return validade;
	}


	public void setValidade(String validade) {
		this.validade = validade;
	}


	public String getFabricante() {
		return fabricante;
	}


	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public Fornecedor getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
}
