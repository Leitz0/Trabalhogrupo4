package classes;

import java.util.Date;

public class Cliente extends Pessoa{
	private int idCliente;
	private String cpf;
	private Date dtNascimento;
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cpf=" + cpf + ", dtNascimento=" + dtNascimento + "]";
	}
	/**
	 * @param nome
	 * @param endereco
	 * @param telefone
	 * @param idCliente
	 * @param cpf
	 * @param dtNascimento
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
	public int getIdCliente() {
		return idCliente;
	}

	
	
}
