package classes;

public class PedidoItens {
	private int idPedidoItem;
	private double vlUnitario;
	private Produto produto;
	private double qtProduto;
	private double vlDesconto;

	
	// Construtor
    public PedidoItens(Produto produto, double vlUnitario, int qtProduto, double vlDesconto) {
        
        this.produto = produto;
        this.vlUnitario = vlUnitario;
        this.qtProduto = qtProduto;
        this.vlDesconto = vlDesconto;
    }

    

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getVlUnitario() {
        return vlUnitario;
    }

    public void setVlUnitario(double vlUnitario) {
        this.vlUnitario = vlUnitario;
    }

    public double getQtProduto() {
        return qtProduto;
    }

    public void setQtProduto(int qtProduto) {
        this.qtProduto = qtProduto;
    }

    public double getVlDesconto() {
        return vlDesconto;
    }

    public void setVlDesconto(double vlDesconto) {
        this.vlDesconto = vlDesconto;
    }

    // Método para calcular o valor total do item
    public double calcularValorTotal() {
        return (vlUnitario * qtProduto) - vlDesconto;
    }
    

    public int getIdPedidoItem() {
		return idPedidoItem;
	}



	public void setIdPedidoItem(int idPedidoItem) {
		this.idPedidoItem = idPedidoItem;
	}



	// Método toString
    @Override
    public String toString() {
        return "PedidoItens{" +
                "idpedidoitem=" + idPedidoItem +
                ", produto=" + produto +
                ", vlUnitario=" + vlUnitario +
                ", qtProduto=" + qtProduto +
                ", vlDesconto=" + vlDesconto +
                '}';
    }
}

