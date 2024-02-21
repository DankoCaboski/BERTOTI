public class Estacao {

    public static Double temp;
    public static Double press;
    
    public static void notifyObservers(){
        Dashboard.update(temp, press);
        Estatisticas.update(temp, press);

    }

    public static void setTemp(Double nTemp){
        temp = nTemp;
    }
    
    public static void setPress(Double nPress){
        press = nPress;
    }
}
