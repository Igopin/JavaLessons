package tetris;

import java.util.ArrayList;
import java.util.List;

public class Model {

    Logic _logic;

    List<ModelListener> _listeners = new ArrayList<>();
        
    public Model() {
        Field field = new Field(10, 20);
        State state = new State();
        state.setField(field);
        state.setFigure(Figure.getRandomFigure());
        _logic = new Logic(state);
    }
    
    public void addListener(final ModelListener listener) {
        _listeners.add(listener);
    }

    public void removeListener(final ModelListener listener) {
        _listeners.remove(listener);
    }
    
    void fireChangeEvent() {
        for (ModelListener modelListener : _listeners) {
            modelListener.onChange(_logic.getState());
        }
    }
    
    public void moveLeft() {
        if (_logic.moveLeft()) {
            fireChangeEvent();
        }
    }

    public void moveRight() {
        if (_logic.moveRight()) {
            fireChangeEvent();
        }
    }

    public void dropDown() {
        _logic.dropDown();
        fireChangeEvent();
    }

    public void moveDown() {
        if (_logic.moveDown()) {
            fireChangeEvent();
        }
    }

}
