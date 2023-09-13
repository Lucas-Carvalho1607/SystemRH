package Classe;

import Abstrata.Funcionario;
import Enum.UnidadeFederal;

public class Supervisor extends Funcionario {
    private double dinheiroSalario;
    private double dinheiroFgts;
    private double dinheiroInss;
    private double dinheiroDecimo;
    private double dinheiroFerias;
    private double recebimentoSalario;

    private static UnidadeFederal uf = UnidadeFederal.RJ;
    private  Endereco endereco1 = new Endereco("Salgados", "Queijo com presunto", "230", "Casa", uf);
    private static Supervisor supervisor = new Supervisor("Rodrigo", "158926564", "10/08/2005", "5456354", "265296", "Supervisor");

    public Supervisor(String nome, String cpf, String dataNasc, String matricula, String ctps, String cargo) {
        super(nome, cpf, dataNasc, matricula, ctps, cargo);
        
    }

    @Override
    public void salario() {
        recebimentoSalario = pagamento * 3;
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

    public static String informacoesSupervisor() {
        return "Nome: " + supervisor.nome + "\nCPF: " + supervisor.cpf + "\nData de Nascimento: " + supervisor.dataNasc
                + "\nCtps: " +
                supervisor.ctps + "\nMatrícula: " + supervisor.matricula + "\nEndereço: " + "\nRua: "
                + supervisor.endereco1.rua + ", " +
                supervisor.endereco1.bairro + ", " + supervisor.endereco1.numero + ", "
                + supervisor.endereco1.complemento + ", " + supervisor.endereco1.uf +
                "\nFolha de pagamento:\n " + "\nSalário: " + supervisor.dinheiroSalario + "\nFgts: "
                + supervisor.dinheiroFgts + "\nInss: " +
                supervisor.dinheiroInss + "\nDécimo Terceiro: " + supervisor.dinheiroDecimo + "\nFérias: "
                + supervisor.dinheiroFerias;
    }
}
