package Classe;

import Abstrata.Funcionario;
import Enum.UnidadeFederal;

public class Gerente extends Funcionario {
    private double dinheiroSalario;
    private double dinheiroFgts;
    private double dinheiroInss;
    private double dinheiroDecimo;
    private double dinheiroFerias;
    private double recebimentoSalario;

    private static UnidadeFederal uf = UnidadeFederal.RJ;
    private static Endereco endereco1 = new Endereco("Salgados", "Coxinha", "300", "Casa", uf);
    private static Gerente gerente = new Gerente("Lucas", "156465156", "30/04/1997", "156126", "465464");

    public Gerente(String nome, String cpf, String dataNasc, String matricula, String ctps) {
        super(nome, cpf, dataNasc, matricula, ctps);
        salario();
        fgts();
        inss();
        decimoTerceiro();
        ferias();

    }

    @Override
    public void salario() {
        recebimentoSalario = pagamento * 5;
        dinheiroSalario = recebimentoSalario;

    }

    @Override
    public void fgts() {
        double recebimentoFgts = recebimentoSalario * 0.08;
        dinheiroFgts = recebimentoFgts;

    }

    @Override
    public void inss() {
        double recebimentoInss = recebimentoSalario * 0.09 - 15.57;
        dinheiroInss = recebimentoInss;
    }

    @Override
    public void decimoTerceiro() {
        double recebimentoDecimo = recebimentoSalario * 2;
        dinheiroDecimo = recebimentoDecimo;

    }

    @Override
    public void ferias() {
        double recebimentoFerias = recebimentoSalario * 1.33;
        dinheiroFerias = recebimentoFerias;
    }

    public static String informacoesGerente() {
        return "Nome: " + gerente.nome + "\nCPF: " + gerente.cpf + "\nData de Nascimento: " + gerente.dataNasc
                + "\nCtps: " +
                gerente.ctps + "\nMatrícula: " + gerente.matricula + "\nEndereço: " + "\nRua: " + Gerente.endereco1.rua
                + ", " +
                Gerente.endereco1.bairro + ", " + Gerente.endereco1.numero + ", " + Gerente.endereco1.complemento + ", "
                + Gerente.endereco1.uf +
                "\nFolha de pagamento:\n " + "\nSalário: " + gerente.dinheiroSalario + "\nFgts: " + gerente.dinheiroFgts
                + "\nInss: " +
                gerente.dinheiroInss + "\nDécimo Terceiro: " + gerente.dinheiroDecimo + "\nFérias: "
                + gerente.dinheiroFerias;
    }
}
