package benakka.observer;

public interface Observable {
    void subscribe(ComponentObserver c);
    void unsubscribe(ComponentObserver c);
    void notifyObservers();
}
