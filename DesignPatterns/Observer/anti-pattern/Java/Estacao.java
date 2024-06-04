public class Estacao {

    public static Double temp;
    public static Double press;
    
    public static void notifyObservers(){
        Dashboard dashboard = new Dashboard();
        dashboard.update(temp, press);
        dashboard.print();
        Estatisticas estatisticas = new Estatisticas();
        estatisticas.update(temp, press);
        estatisticas.print();

    }

    public static void setTemp(Double nTemp){
        temp = nTemp;
    }
    
    public static void setPress(Double nPress){
        press = nPress;
    }
}
