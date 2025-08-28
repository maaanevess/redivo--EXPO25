package loja_de_doces.model;

public class Doces {
    private int id;
    private String nomeDoces;
    private int valor;
    private String sabor;

    public Doces(int id, String nomeDoces, int valor, String sabor){
        this.id = id;
        this.nomeDoces = nomeDoces;
        this.valor = valor;
        this.sabor = sabor;
    }

    public void setId(int id) { 
        this.id = id; 
    }

    public void setNomeDoces(String nomeDoces) { 
        this.nomeDoces = nomeDoces; 
    }

    public void setValor(int valor) { 
        this.valor = valor; 
    }

    public void setSabor(String sabor) { 
        this.sabor = sabor; 
    }

    public int getId() { 
        return id; 
    }

    public String getNomeDoces() { 
        return nomeDoces; 
    }

    public int getValor() { 
        return valor; 
    }

    public String getSabor() { 
        return sabor; 
    }
}
