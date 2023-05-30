	package classe;
	
	public class Funcionario extends Pessoa {
	
		private String matricula;
		private String setor;
		private String funcao;
		private double salario;
	
		public Funcionario() {
			super();
		}

		

		public Funcionario(String nome, String cpf, String dataNascimento, Endereco endereco, String matricula,
				String setor, String funcao, double salario) {
			super(nome, cpf, dataNascimento, endereco);
			this.matricula = matricula;
			this.setor = setor;
			this.funcao = funcao;
			this.salario = salario;
		}



		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public String getSetor() {
			return setor;
		}

		public void setSetor(String setor) {
			this.setor = setor;
		}

		public String getFuncao() {
			return funcao;
		}

		public void setFuncao(String funcao) {
			this.funcao = funcao;
		}

		public double getSalario() {
			return salario;
		}

		public void setSalario(double salario) {
			this.salario = salario;
		}

		@Override
		public String toString() {
			return "Funcionario matricula=" + matricula + ", setor" + setor + ", funcao" + funcao + ", salario"
					+ salario + "]";
		}
		
		
	}
