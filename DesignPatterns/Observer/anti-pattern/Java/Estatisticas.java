public class Estatisticas {
    public static void update(Double temp, Double press){
        if(temp == null){
            temp = 0.0;
        }
        if(press == null){
            press = 0.0;
        }
        System.out.println("Tela de estatisticas:");
        System.out.println( "Temperatura: " + temp.toString()+"Cº\nPressão: "+press.toString()+"PSI\n");
    }
}
