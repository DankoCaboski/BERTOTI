package Observer.pattern.java;

import java.util.LinkedList;

public class Estacao {
    private static Double pressao;
    private static Double temperatura;
    private static LinkedList<Observer> observers = new LinkedList<>();
    
    public static void addObserver(Observer newObserver){
        observers.add(newObserver);
    }

    public static void notifyObservers(){
        for (Observer observer : observers) {
            observer.update(pressao, temperatura);
        }
    }
}
