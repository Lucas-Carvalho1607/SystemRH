package Classe;

import Enum.UnidadeFederal;

public class Endereco {
    String rua;
    String bairro;
    String numero;
    String complemento;
    UnidadeFederal uf;
    
    public Endereco(String rua, String bairro, String numero, String complemento, UnidadeFederal uf) {
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
        this.complemento = complemento;
        this.uf = uf;
    }
    
}
