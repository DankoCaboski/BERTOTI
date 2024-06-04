public class Dashboard {
    
    public Double temp;
    public  Double press;

    public void update(Double temp, Double press){
        if(temp == null){
            this.temp = 0.0;
        }
        else{
            this.temp = temp;
        }
        if(press == null){
            this.press = 0.0;
        }
        else{
            this.press = press;
        }
    }

    public void print(){
        System.out.println("\nTela de dashboard:");
        System.out.println( "Temperatura: " + temp.toString()+"ºC\nPressão: "+press.toString()+"PSI\n");
    }
    
}
