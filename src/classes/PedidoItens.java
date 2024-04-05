package classes;

public class PedidoItens {
	private double vlunitario;
	private Produto produto;
	private double qtproduto;
	private double vldesconto;

	
	/ Construtor
    public PedidoItens(Produto produto, double vlunitario, int qtproduto, double vldesconto) {
        
        this.produto = produto;
        this.vlunitario = vlunitario;
        this.qtproduto = qtproduto;
        this.vldesconto = vldesconto;
    }

    

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getVlunitario() {
        return vlunitario;
    }

    public void setVlunitario(double vlunitario) {
        this.vlunitario = vlunitario;
    }

    public int getQtproduto() {
        return qtproduto;
    }

    public void setQtproduto(int qtproduto) {
        this.qtproduto = qtproduto;
    }

    public double getVldesconto() {
        return vldesconto;
    }

    public void setVldesconto(double vldesconto) {
        this.vldesconto = vldesconto;
    }

    // Método para calcular o valor total do item
    public double calcularValorTotal() {
        return (vlunitario * qtproduto) - vldesconto;
    }

    // Método toString
    @Override
    public String toString() {
        return "PedidoItens{" +
                "idpedidoitem=" + idpedidoitem +
                ", produto=" + produto +
                ", vlunitario=" + vlunitario +
                ", qtproduto=" + qtproduto +
                ", vldesconto=" + vldesconto +
                '}';
    }
}
}
