package classe;



public class Prestador extends Pessoa {

	private String servico;
	
	
	public Prestador() {
		super();
	}
	
	
	public Prestador(String nome, String cpf, String dataNascimento, Endereco endereco, String servico) {
		super(nome, cpf, dataNascimento, endereco);
		this.servico = servico;
	}


	public String getServico() {
		return servico;
	}


	public void setServico(String servico) {
		this.servico = servico;
	}


	@Override
	public String toString() {
		return "Prestador servico " + servico + "]";
	}
	
}
