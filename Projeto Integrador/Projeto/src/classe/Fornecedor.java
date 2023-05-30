package classe;

public class Fornecedor extends Pessoa{
	
	public Fornecedor() {
		super();
	}

	public Fornecedor(String nome, String cpf, String dataNascimento, Endereco endereco) {
		super(nome, cpf, dataNascimento, endereco);

	}

	@Override
	public String toString() {
		return  getNome();
	}
	
}
