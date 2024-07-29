package LLD2.DesignPatterns.observer.video;

import java.util.Observable;
import java.util.Observer;

public interface VideoSubject {

    public void subscribe(Observable observer);
    public void unsubscribe(Observable observer);
    public void notifyObservers();



}
