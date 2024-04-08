package classes;

public class PedidoItens {
	private int idPedidoItem;
	private double vlUnitario;
	private Produto produto;
	private double qtProduto;
	private double vlDesconto;

	
	// Construtor
    public PedidoItens(Produto produto, double vlUnitario, double qtProduto, double vlDesconto) {
        
        this.produto = produto;
        this.vlUnitario = vlUnitario;
        this.qtProduto = qtProduto;
        this.vlDesconto = vlDesconto;
    }

    

    public int getIdPedidoItem() {
		return idPedidoItem;
	}



	public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getvlUnitario() {
        return vlUnitario;
    }

    public void setvlUnitario(double vlUnitario) {
        this.vlUnitario = vlUnitario;
    }

    public double getqtProduto() {
        return qtProduto;
    }

    public void setqtProduto(double qtProduto) {
        this.qtProduto = qtProduto;
    }

    public double getvlDesconto() {
        return vlDesconto;
    }

    public void setvlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    // Método para calcular o valor total do item
    public double calcularValorTotal() {
        return (vlUnitario * qtProduto) - vlDesconto;
    }

    // Método toString
    @Override
    public String toString() {
        return "PedidoItens{" +
        		"código:" + idPedidoItem +
                ", produto=" + produto +
                ", vlUnitario=" + vlUnitario +
                ", qtProduto=" + qtProduto +
                ", vlDesconto=" + vlDesconto +
                '}';
    }

}
