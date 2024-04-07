package classes;

import java.util.Date;

public class Pedido {
	private Date dtEmissao;
	private Date dtEntrega;
	private double valorTotal;
	private String observacao;
	
	
	
	
	
	@Override
	public String toString() {
		return "Pedido \nData Emissao: " + dtEmissao + "\nData Entrega: " + dtEntrega + "\nValor total: " + valorTotal
				+ "\nObservacao:" + observacao ;
	}
	/**
	 * @param dtEmissao
	 * @param dtEntrega
	 * @param valorTotal
	 * @param observacao
	 */
	public Pedido(Date dtEmissao, Date dtEntrega, double valorTotal, String observacao) {
		super();
		this.dtEmissao = dtEmissao;
		this.dtEntrega = dtEntrega;
		this.valorTotal = valorTotal;
		this.observacao = observacao;
	}
	public Date getDtEmissao() {
		return dtEmissao;
	}
	public void setDtEmissao(Date dtEmissao) {
		this.dtEmissao = dtEmissao;
	}
	public Date getDtEntrega() {
		return dtEntrega;
	}
	public void setDtentrega(Date dtEntrega) {
		this.dtEntrega = dtEntrega;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValortotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
