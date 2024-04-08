package classes;

public class Produto {
	private int idProduto;
    private String descricao;
    private double vlCusto;
    private double vlVenda;
    private String categoria;
    
    
    
    
    
	
	
	@Override
	public String toString() {
		return "Produto [idProduto=" + idProduto + ", descricao=" + descricao + ", vlCusto=" + vlCusto + ", vlVenda="
				+ vlVenda + ", categoria=" + categoria + "]";
	}
	/**
	 * @param idProduto
	 * @param descricao
	 * @param vlCusto
	 * @param vlVenda
	 * @param categoria
	 */
	public Produto( String descricao, double vlCusto, double vlVenda, String categoria) {
		super();
		
		this.descricao = descricao;
		this.vlCusto = vlCusto;
		this.vlVenda = vlVenda;
		this.categoria = categoria;
	}
	public String getDescricao() {
		return descricao;
	}
	public double getvlCusto() {
		return vlCusto;
	}
	public double getvlVenda() {
		return vlVenda;
	}
	public String getCategoria() {
		return categoria;
	}
	public int getIdProduto() {
		return idProduto;
	}
    
    
    
}
