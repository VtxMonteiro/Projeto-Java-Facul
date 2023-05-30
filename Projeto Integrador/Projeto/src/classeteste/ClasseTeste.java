package classeteste;

import java.util.Scanner;

import classe.Cliente;
import classe.Endereco;
import classe.Fornecedor;
import classe.Funcionario;
import classe.Produto;

public class ClasseTeste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
//		Menu tipo de cadastro
		
		System.out.println("Seja bem-vindo, faça seu cadastro!");
		System.out.println(" ");
		
		System.out.println("Informe o tipo de cadastro: ");
		System.out.println("1. Cliente ");
		System.out.println("2. Prestador ");
		System.out.println("3. Fornecedor ");
		System.out.println("4. Funcionario ");
		System.out.println("5. Produto" );
		char tipoCadastro = sc.nextLine().charAt(0);
		
		if (tipoCadastro == '1') {
			
			Cliente cliente = new Cliente();
			
			System.out.println("Informe seu nome: ");
			cliente.setNome(sc.nextLine());
			
			System.out.println("Informe seu CPF: ");
			cliente.setCpf(sc.nextLine());
			
			System.out.println("Informe sua data de nascimento: ");
			cliente.setDataNascimento(sc.nextLine());
			
			Endereco endereco = new Endereco();
			
			System.out.println("Informe seu endereço ");
			System.out.println(" ");
			
			System.out.println("Informe sua Cidade: ");
			endereco.setCidade(sc.nextLine());
			
			System.out.println("Informe seu bairro: ");
			endereco.setBairro(sc.nextLine());
			
			System.out.println("Informe seu cep: ");
			endereco.setCep(sc.nextLine());
			
			System.out.println("Informe sua rua: ");
			endereco.setRua(sc.nextLine());
			
			System.out.println("Informe o numero da sua residencia: ");
			endereco.setNumero(sc.nextLine());
			
			System.out.println("Informe o complemento: ");
			endereco.setCompletemento(sc.nextLine());
			cliente.setEndereco(endereco);
			
			System.out.println("Cadastro feito com sucesso! Confira seus dados");
			System.out.println(" ");
			
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("CPF: " + cliente.getCpf());
			System.out.println("Data de nascimento: " + cliente.getDataNascimento());
			System.out.println("Cidade: " + endereco.getCidade());
			System.out.println("Bairro: " + endereco.getBairro());
			System.out.println("Cep: " + endereco.getCep());
			System.out.println("Rua: " + endereco.getRua());
			System.out.println("Numero Residencia: " + endereco.getNumero());
			System.out.println("Complemento: " + endereco.getCompletemento());
			
		}
		
//		Cadastro de Prestador
		
		if (tipoCadastro == '2') {
			
			classe.Prestador prestador = new classe.Prestador();
			
			System.out.println("Informe seu nome: ");
			prestador.setNome(sc.nextLine());
			
			System.out.println("Informe seu CPF: ");
			prestador.setCpf(sc.nextLine());
			
			System.out.println("Informe sua data de nascimento: ");
			prestador.setDataNascimento(sc.nextLine());
			
			Endereco endereco = new Endereco();
			
			System.out.println("Informe seu endereço ");
			System.out.println(" ");
			
			System.out.println("Informe sua Cidade: ");
			endereco.setCidade(sc.nextLine());
			
			System.out.println("Informe seu bairro: ");
			endereco.setBairro(sc.nextLine());
			
			System.out.println("Informe seu cep: ");
			endereco.setCep(sc.nextLine());
			
			System.out.println("Informe sua rua: ");
			endereco.setRua(sc.nextLine());
			
			System.out.println("Informe o numero da sua residencia: ");
			endereco.setNumero(sc.nextLine());
			
			System.out.println("Informe o complemento: ");
			endereco.setCompletemento(sc.nextLine());
			prestador.setEndereco(endereco);
			
			System.out.println("Cadastro feito com sucesso! Confira seus dados");
			System.out.println(" ");
			
			System.out.println("Nome: " + prestador.getNome());
			System.out.println("CPF: " + prestador.getCpf());
			System.out.println("Data de nascimento: " + prestador.getDataNascimento());
			
			System.out.println("Cidade: " + endereco.getCidade());
			System.out.println("Bairro: " + endereco.getBairro());
			System.out.println("Cep: " + endereco.getCep());
			System.out.println("Rua: " + endereco.getRua());
			System.out.println("Numero Residencia: " + endereco.getNumero());
			System.out.println("Complemento: " + endereco.getCompletemento());
		}
		
//		Cadastro de Fornecedor
		
		if (tipoCadastro == '3') {
			
			Fornecedor fornecedor = new Fornecedor();
			
			System.out.println("Informe seu nome: ");
			fornecedor.setNome(sc.nextLine());
			
			System.out.println("Informe seu CPF: ");
			fornecedor.setCpf(sc.nextLine());
			
			System.out.println("Informe sua data de nascimento: ");
			fornecedor.setDataNascimento(sc.nextLine());
			
			Endereco endereco = new Endereco();
			
			System.out.println("Informe seu endereço ");
			System.out.println(" ");
			
			System.out.println("Informe sua Cidade: ");
			endereco.setCidade(sc.nextLine());
			
			System.out.println("Informe seu bairro: ");
			endereco.setBairro(sc.nextLine());
			
			System.out.println("Informe seu cep: ");
			endereco.setCep(sc.nextLine());
			
			System.out.println("Informe sua rua: ");
			endereco.setRua(sc.nextLine());
			
			System.out.println("Informe o numero da sua residencia: ");
			endereco.setNumero(sc.nextLine());
			
			System.out.println("Informe o complemento: ");
			endereco.setCompletemento(sc.nextLine());
			fornecedor.setEndereco(endereco);
			
			System.out.println("Cadastro feito com sucesso! Confira seus dados");
			System.out.println(" ");
			
			System.out.println("Nome: " + fornecedor.getNome());
			System.out.println("CPF: " + fornecedor.getCpf());
			System.out.println("Data de nascimento: " + fornecedor.getDataNascimento());
			System.out.println(" ");
			
			System.out.println("Cidade: " + endereco.getCidade());
			System.out.println("Bairro: " + endereco.getBairro());
			System.out.println("Cep: " + endereco.getCep());
			System.out.println("Rua: " + endereco.getRua());
			System.out.println("Numero Residencia: " + endereco.getNumero());
			System.out.println("Complemento: " + endereco.getCompletemento());
		}
		
//		Cadastro de Funcionario
		
		if (tipoCadastro == '4') {
			
			Funcionario funcionario = new Funcionario();
			
			System.out.println("Cadastrar novo funcionario ");
			System.out.println(" ");
			
			System.out.println("Informe o nome do funcionário (a): ");
			funcionario.setNome(sc.nextLine());
			
			System.out.println("Informe o setor do funcionário: ");
			funcionario.setSetor(sc.nextLine());
					
			System.out.println("Informe a função do funcionário: ");
			funcionario.setFuncao(sc.nextLine());
			
			System.out.println("Informe o salário do funcionário: ");
			funcionario.setSalario(sc.nextDouble());
			
			System.out.println("Funcionário (a): " + funcionario.getNome());
			System.out.println("Setor: " + funcionario.getSetor());
			System.out.println("Função: " + funcionario.getFuncao());
			System.out.println("Salário: " + funcionario.getSalario());
			System.out.println(" ");
		}
		
//		Cadastro de Produto
		
		if (tipoCadastro == '5') {
			
			Produto produto = new Produto();

			System.out.println("Informe os dados do produto");
			
			System.out.println(" ");
			
			System.out.println("Cadastre seus produtos");
			
			
			System.out.println("Nome do produto: ");
			produto.setNome(sc.nextLine());
			
			System.out.println("Nome da marca: ");
			produto.setMarca(sc.nextLine());
			
			System.out.println("Validade do produto: ");
			produto.setValidade(sc.nextLine());
			
			System.out.println("Nome do fabricante: ");
			produto.setFabricante(sc.nextLine());
			
			System.out.println("Diga o valor do produto: ");
			produto.setValor(sc.nextDouble());
			
			System.out.println("Informe o nome do fornecedor: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			Fornecedor fornecedor = new Fornecedor(nome, null, null, null);
			produto.setFornecedor(fornecedor);
		
			
			System.out.println("Produto cadastrado com sucesso!");
			System.out.println(" ");
			
			System.out.println("Marca: " + produto.getMarca());
			System.out.println("Validade: " + produto.getValidade());
			System.out.println("Fabricante: " + produto.getFabricante());
			System.out.println("Valor: " + produto.getValor());
			System.out.println("Fornecedor: " + produto.getFornecedor());
			
		}
		sc.close();
	}
}
