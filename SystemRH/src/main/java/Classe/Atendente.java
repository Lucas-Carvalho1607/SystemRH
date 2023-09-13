package Classe;

import Abstrata.Funcionario;
import Enum.UnidadeFederal;

public class Atendente extends Funcionario {
    private double dinheiroSalario;
    private double dinheiroFgts;
    private double dinheiroInss;
    private double dinheiroDecimo;
    private double dinheiroFerias;
    private double recebimentoSalario;

    static UnidadeFederal uf = UnidadeFederal.RJ;
    private  Endereco endereco1 = new Endereco("Salgados", "Quibe", "100", "Casa", uf);
    private static Atendente atendente = new Atendente("Escravo", "18946543", "20/01/1990", "456461", "3874864", "Atendente");

    public Atendente(String nome, String cpf, String dataNasc, String matricula, String ctps, String cargo) {
        super(nome, cpf, dataNasc, matricula, ctps, cargo);
        salario();
        fgts();
        inss();
        decimoTerceiro();
        ferias();
    }

    @Override
    public void salario() {
        recebimentoSalario = pagamento * 1;
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

    public static String informacoesAtendente() {
        return "Nome: " + atendente.nome + "\nCPF: " + atendente.cpf + "\nData de Nascimento: " + atendente.dataNasc
                + "\nCtps: " +
                atendente.ctps + "\nMatrícula: " + atendente.matricula + "\nEndereço: " + "\nRua: "
                + atendente.endereco1.rua + ", " +
                atendente.endereco1.bairro + ", " + atendente.endereco1.numero + ", " + atendente.endereco1.complemento
                + ", " + atendente.endereco1.uf +
                "\nFolha de pagamento:\n " + "\nSalário: " + atendente.dinheiroSalario + "\nFgts: " + atendente.dinheiroFgts
                + "\nInss: " +
                atendente.dinheiroInss + "\nDécimo Terceiro: " + atendente.dinheiroDecimo + "\nFérias: "
                + atendente.dinheiroFerias;
    }
}
