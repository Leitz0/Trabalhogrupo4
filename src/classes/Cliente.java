package classes;

import java.util.Date;
import java.util.Scanner;

public class Cliente extends Pessoa{
	private String cpf;
	private Date dtNascimento;
		
	
	@Override
	public String toString() {
		return "Cliente\n" + super.toString() + "\nCPF:" + cpf + "\nData de Nascimento:" + dtNascimento;
	}
	/**
	 * @param nome
	 * @param endereco
	 * @param telefone
	 * @param cpf
	 * @param dataNascimento
	 */
	public Cliente(String nome, String endereco, String telefone, String cpf, Date dtNascimento) {
		super(nome, endereco, telefone);
		this.cpf = cpf;
		this.dtNascimento = dtNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public void buscaCliente() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual dado deseja informar para busca do cliente?");
		System.out.println("1 - CPF");
		System.out.println("2 - Nome");
		System.out.println("3 - Código do cliente");
		
		int buscarDados = scanner.nextInt();
		switch (buscarDados) {
		    case 1:
		        System.out.print("Digite o CPF do cliente: ");
		        String cpf = scanner.next();		        
		        System.out.println("Você escolheu buscar por CPF: " + cpf);
		        break;
		    case 2:
		        System.out.print("Digite o nome do cliente: ");
		        String nome = scanner.next();
		        System.out.println("Você escolheu buscar por nome: " + nome);
		        break;
		    case 3:
		        System.out.print("Digite o código do cliente: ");
		        int codigo = scanner.nextInt();		       
		        
		        break;
		    default:
		        System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
		}
		
	}
}

