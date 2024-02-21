public class Dashboard {

    public static void update(Double temp, Double press){
        if(temp == null){
            temp = 0.0;
        }
        if(press == null){
            press = 0.0;
        }
        System.out.println("\nTela de dashboard:");
        System.out.println( "Temperatura: " + temp.toString()+"ºC\nPressão: "+press.toString()+"PSI\n");
    }
    
}
