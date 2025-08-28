package loja_de_doces.model;

public class Funcionarios {
    private String nomeFuncionarios;
    private String cpf;
    private String funcao;

    public Funcionarios(String nomeFuncionarios, String cpf, String funcao) {
        this.nomeFuncionarios = nomeFuncionarios;
        this.cpf = cpf;
        this.funcao = funcao;
    }

    public void setNomeFuncionarios(String nomeFuncionarios) { 
        this.nomeFuncionarios = nomeFuncionarios; 
    }

    public void setCpf(String cpf) { 
        this.cpf = cpf; 
    }

    public void setFuncao(String funcao) { 
        this.funcao = funcao; 
    }

    public String getNomeFuncionarios() { 
        return nomeFuncionarios; 
    }

    public String getCpf() { 
        return cpf; 
    }

    public String getFuncao() { 
        return funcao; 
    }
    
}
