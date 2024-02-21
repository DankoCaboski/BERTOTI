package Observer.pattern.java;

public class Dashboard implements Observer{

    public Dashboard(){
    }

    @Override
    public void update(Double press, Double temp) {
        System.out.println("dash");
    }
    
}
