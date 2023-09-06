package Classe;

import Abstrata.Funcionario;

public class Gerente extends Funcionario{
    private double salar;

    public Gerente (String nome, String cpf, String dataNasc, String ctps, Endereco endereco, 
    String matricula){
        super(nome, cpf, dataNasc, ctps, endereco, matricula);
    }
    @Override
        public void salario() {
        salar = pagamento * 3;
        
    }
    @Override
        public void fgts() {
        salar = pagamento * 0.08;
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
