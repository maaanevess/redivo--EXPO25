package loja_de_doces.model;

public class Clientes {
    private String nome;
    private String endereco;
    private String cpf;

    public Clientes(String nome, String endereco, String cpf) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public void setNome(String nome) { 
        this.nome = nome; 
    }

    public void setEndereco(String endereco) { 
        this.endereco = endereco; 
    }

    public void setCpf(String cpf) { 
        this.cpf = cpf; 
    }

    public String getNome() { 
        return nome; 
    }

    public String getEndereco() { 
        return endereco; 
    }

    public String getCpf() { 
        return cpf; 
    }
}
