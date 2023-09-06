package Classe;

import Abstrata.Funcionario;


public class Atendente extends Funcionario  {
    
    public Atendente (String nome, String cpf, String dataNasc, String ctps, Endereco endereco, 
    String matricula) {
        super(nome, cpf, dataNasc, ctps, endereco, matricula);
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
