package classes;

import java.util.Date;

public class Pedido {
	private int idPedido;
	private Date dtEmissao;
	private Date dtEntrega;
	private double valorTotal;
	private String observacao;
	
	//teste
	
	
	
	
	
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

	@Override
	public String toString() {
		return "Pedido [idPedido=" + idPedido + ", dtEmissao=" + dtEmissao + ", dtEntrega=" + dtEntrega
				+ ", valorTotal=" + valorTotal + ", observacao=" + observacao + "]";
	}
	
	public Date getdtEmissao() {
		return dtEmissao;
	}
	public void setdtEmissao(Date dtEmissao) {
		this.dtEmissao = dtEmissao;
	}
	public Date getdtEntrega() {
		return dtEntrega;
	}
	public void setdtEntrega(Date dtEntrega) {
		this.dtEntrega = dtEntrega;
	}
	public double getvalorTotal() {
		return valorTotal;
	}
	public void setvalorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public int getIdpedido() {
		return idPedido;
	}
}
