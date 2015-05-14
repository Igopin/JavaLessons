package lesson150514.jmock;

public class Termometer {

    int currentTemperaure;
    TermometerListener listener;

    public void inc() {
        currentTemperaure++;
        listener.changed(currentTemperaure);
    }
    
    public void dec() {
        currentTemperaure--;
        listener.changed(currentTemperaure);
    }

    public void setListener(TermometerListener tl) {
        this.listener = tl;
    }
}
