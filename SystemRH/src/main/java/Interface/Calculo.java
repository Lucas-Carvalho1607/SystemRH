package Interface;

import java.util.ArrayList;

import Abstrata.Funcionario;

public interface Calculo {
    void salario();

    void fgts();

    void inss();

    void decimoTerceiro();

    void ferias();

     default ArrayList<Funcionario> add_Func(ArrayList<Funcionario> lista_Func, Funcionario pessoa) {
        lista_Func.add(pessoa);
        return lista_Func;
    }
}
