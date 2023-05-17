package Back;

import java.util.Scanner;

public class Login {
    public boolean inicializar(){
        System.out.println("Digite 1 para funcionario e 2 para cliente");
        Scanner leitor = new Scanner(System.in);
        if(leitor.nextInt()==1) {
            return true;
        }else{
            return false;
        }
    }
}
