package classe;

public class Endereco {
	
	private String rua;
	private String numero;
	private String bairro;
	private String cep;
	private String cidade;
	private String completemento;

	public Endereco () {
	}

	public Endereco(String rua, String numero, String bairro, String cep, String cidade, String completemento) {

		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.completemento = completemento;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCompletemento() {
		return completemento;
	}

	public void setCompletemento(String completemento) {
		this.completemento = completemento;
	}

	@Override
	public String toString() {
		return "Endereco rua: " + rua +
				", numero: " + numero + 
				", bairro: " + bairro + 
				", cep: " + cep + ", cidade: "
				+ cidade + ", "+ 
				"completemento: " + completemento + "";
	}
	
	
}
