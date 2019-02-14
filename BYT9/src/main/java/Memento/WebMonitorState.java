package Memento;

import Participants.Observer;

import java.io.Serializable;
import java.net.URL;
import java.util.Date;
import java.util.Map;
import java.util.Set;

public class WebMonitorState implements Serializable {

    private Map<URL, Date> lastModifiedDates;
    private Map<URL, Set<Observer>> observers;

    public WebMonitorState(Map<URL, Date> lastModifiedDates, Map<URL, Set<Observer>> observers) {
        this.lastModifiedDates = lastModifiedDates;
        this.observers = observers;
    }

    public Map<URL, Date> getLastModifiedDates() {
        return lastModifiedDates;
    }

    public void setLastModifiedDates(Map<URL, Date> lastModifiedDates) {
        this.lastModifiedDates = lastModifiedDates;
    }

    public Map<URL, Set<Observer>> getObservers() {
        return observers;
    }

    public void setObservers(Map<URL, Set<Observer>> observers) {
        this.observers = observers;
    }
}