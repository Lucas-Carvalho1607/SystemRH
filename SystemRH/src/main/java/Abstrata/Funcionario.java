package Abstrata;


import java.time.LocalDateTime;
import java.util.ArrayList;

import Interface.Calculo;


public abstract class Funcionario extends Pessoa implements Calculo {
    public double pagamento = 1320.00;
    protected String ctps;
    protected String cargo;
    private LocalDateTime dataContracao = LocalDateTime.now();

    
    
    
    ArrayList<Funcionario> lista_Func = new ArrayList<>();
    
    public Funcionario(String nome, String cpf, String dataNasc, String matricula, String ctps, String cargo) {
        super(nome, cpf, dataNasc, matricula);
        this.ctps = ctps;
        this.cargo = cargo;
    }
    
    public LocalDateTime getDataContracao() {
        return dataContracao;
    }
    
        @Override
    public void salario() {
        

    }

    @Override
    public void fgts() {
    }
        

    @Override
    public void inss() {
        
    }

    @Override
    public void decimoTerceiro() {

    }

    @Override
    public void ferias() {

    }

}
