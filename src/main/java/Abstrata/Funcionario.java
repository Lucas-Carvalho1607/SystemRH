package Abstrata;

import Classe.Endereco;

import Interface.Calculo;

public abstract class Funcionario extends Pessoa implements Calculo{
    public double pagamento = 1320.00;
    protected String ctps;

    public Funcionario (String nome, String cpf, String dataNasc, String ctps, Endereco endereco, 
      String matricula) {
       super(nome, cpf, dataNasc, matricula);
    }
        @Override
        public void salario() {
        pagamento = pagamento * 1;
        
    }
    @Override
        public void fgts() {
        pagamento = pagamento * 0.08;
    }@Override
        public void inss() {
        pagamento = pagamento * 0.09 - 15.57;
}@Override
    public void decimoTerceiro() {
    pagamento = pagamento * 2;

}@Override
public void ferias() {
pagamento = pagamento * 1.33;

}


}
