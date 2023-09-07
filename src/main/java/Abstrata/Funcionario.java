package Abstrata;

import Interface.Calculo;

public abstract class Funcionario extends Pessoa implements Calculo {
    public double pagamento = 1320.00;
    protected String ctps;

    public Funcionario(String nome, String cpf, String dataNasc, String matricula, String ctps) {
        super(nome, cpf, dataNasc, matricula);
        this.ctps = ctps;
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
