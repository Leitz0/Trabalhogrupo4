package classes;

public class Produto {
	private int idproduto;
    private String descricao;
    private double vlcusto;
    private double vlvenda;
    private String categoria;
    
    
    
    
    
	@Override
	public String toString() {
		return "Produto \nDescricao=" + descricao + "\nValor Custo: " + vlcusto + "\t\tValor venda: "
				+ vlvenda + "\nCategoria=" + categoria;
	}
	/**
	 * @param idproduto
	 * @param descricao
	 * @param vlcusto
	 * @param vlvenda
	 * @param categoria
	 */
	public Produto(int idproduto, String descricao, double vlcusto, double vlvenda, String categoria) {
		super();
		this.idproduto = idproduto;
		this.descricao = descricao;
		this.vlcusto = vlcusto;
		this.vlvenda = vlvenda;
		this.categoria = categoria;
	}
	public int getIdproduto() {
		return idproduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public double getVlcusto() {
		return vlcusto;
	}
	public double getVlvenda() {
		return vlvenda;
	}
	public String getCategoria() {
		return categoria;
	}
    
    
    
}
