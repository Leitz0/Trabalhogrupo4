package classes;

public abstract class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	
	
	
	
	
	@Override
	public String toString() {
		return "Nome: " + nome + "\nEndereco: " + endereco + "Telefone: " + telefone;
	}
	/**
	 * @param nome
	 * @param endereco
	 * @param telefone
	 */
	public Pessoa(String nome, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	
	
	
}
