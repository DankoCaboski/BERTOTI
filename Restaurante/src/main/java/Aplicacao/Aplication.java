package Aplicacao;


import Aplicacao.Back.Login;
import Aplicacao.Cliente.Cliente;
import Aplicacao.Funcionario.Funcionario;

public class Aplication {
    static  Login login = new Login();
    public static void main(String[] args) {
        if(login.inicializar()){
            Funcionario.painelFuncionario();
        }
        else {
            Cliente.painelCliente();
        }
    }
}
