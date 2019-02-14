package Memento;

public interface Memento {
    WebMonitorState getState();
    void setState(WebMonitorState state);
}