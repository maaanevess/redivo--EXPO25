package loja_de_doces.model;

public class Estoque {
    private Doces produto;
    private int quantidade;

    public Estoque(Doces produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Doces getProduto() { 
        return produto; 
    }

    public int getQuantidade() { 
        return quantidade; 
    }

    public void setProduto(Doces produto) { 
        this.produto = produto; 
    }

    public void setQuantidade(int quantidade) { 
        this.quantidade = quantidade; 
    }
}
