package stanislav.danylenko.patterns.behavioral.observer;

public interface Observable {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(CurrencyMessage message);

}
