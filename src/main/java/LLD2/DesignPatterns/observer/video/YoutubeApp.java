package LLD2.DesignPatterns.observer.video;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class YoutubeApp implements VideoSubject {
    private List<String> subscribers = new LinkedList<String>();



    @Override
    public void subscribe(Observable observer) {

    }

    @Override
    public void unsubscribe(Observable observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
