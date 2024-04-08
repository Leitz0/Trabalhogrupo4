package classes;

public class Produto {
	private int idProduto;
    private String descricao;
    private double vlCusto;
    private double vlVenda;
    private String categoria;
    
    
    
    
    
	@Override
	public String toString() {
		return "Produto \nDescricao=" + descricao + "\nValor Custo: " + vlCusto + "\t\tValor venda: "
				+ vlVenda + "\nCategoria=" + categoria;
	}
	/**
	 * @param idProduto
	 * @param descricao
	 * @param vlCusto
	 * @param vlVenda
	 * @param categoria
	 */
	public Produto(int idProduto, String descricao, double vlCusto, double vlVenda, String categoria) {
		super();
		this.idProduto = idProduto;
		this.descricao = descricao;
		this.vlCusto = vlCusto;
		this.vlVenda = vlVenda;
		this.categoria = categoria;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public String getDescricao() {
		return descricao;
	}
	public double getVlCusto() {
		return vlCusto;
	}
	public double getVlVenda() {
		return vlVenda;
	}
	public String getCategoria() {
		return categoria;
	}
    
    
    
}
