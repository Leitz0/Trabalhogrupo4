package classes;

import java.util.Date;

public class Pedido {
	private Date dtemissao;
	private Date dtentrega;
	private double valortotal;
	private String observacao;
	
	
	
	
	
	@Override
	public String toString() {
		return "Pedido \nData Emissao: " + dtemissao + "\nData Entrega: " + dtentrega + "\nValor total: " + valortotal
				+ "\nObservacao:" + observacao ;
	}
	/**
	 * @param dtemissao
	 * @param dtentrega
	 * @param valortotal
	 * @param observacao
	 */
	public Pedido(Date dtemissao, Date dtentrega, double valortotal, String observacao) {
		super();
		this.dtemissao = dtemissao;
		this.dtentrega = dtentrega;
		this.valortotal = valortotal;
		this.observacao = observacao;
	}
	public Date getDtemissao() {
		return dtemissao;
	}
	public void setDtemissao(Date dtemissao) {
		this.dtemissao = dtemissao;
	}
	public Date getDtentrega() {
		return dtentrega;
	}
	public void setDtentrega(Date dtentrega) {
		this.dtentrega = dtentrega;
	}
	public double getValortotal() {
		return valortotal;
	}
	public void setValortotal(double valortotal) {
		this.valortotal = valortotal;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
}
