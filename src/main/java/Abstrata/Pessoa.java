package Abstrata;

import Classe.Endereco;

public abstract class Pessoa {
    protected String nome, cpf, dataNasc, ctps, matricula;
    Endereco endereco;
    
    public Pessoa(String nome, String cpf, String dataNasc, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
   
    
    
    
    

    
}
