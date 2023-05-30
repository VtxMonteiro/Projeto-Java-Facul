package classe;

public class Cliente extends Pessoa{

	private double credito;

	public Cliente(){
		super();
	}
	

	public Cliente(String nome, String cpf, String dataNascimento, Endereco endereco, double credito) {
		super(nome, cpf, dataNascimento, endereco);
		this.credito = credito;
	}


	public double getCredito() {
		
		return credito;
	}

	public void setCredito(double credito) {
		
		this.credito = credito;
	}

	@Override
	public String toString() {
		
		return "Cliente credito: " + credito + "]";
	}
	
	
}
