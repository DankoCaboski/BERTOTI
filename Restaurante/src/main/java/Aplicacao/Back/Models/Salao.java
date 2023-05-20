package Aplicacao.Back.Models;

import java.util.LinkedList;
import java.util.List;

public class Salao {
    private static List<Mesa> mesas = new LinkedList();
    static boolean ini = false;

    public static List<Mesa> getMesas() {
        if (!ini) {
            for (int i = 0; i < 30; i++) {
                Mesa mesa = new Mesa();
                mesa.setNmesa(i+1);
                mesas.add(mesa);
            }
        ini = !ini;
        }
        return mesas;
    }
}


