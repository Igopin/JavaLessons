package tetris;

public class Logic {

    private State _state;

    public Logic(final State state) {
        _state = state;
    }

    public boolean moveLeft() {
        _state.col--;
        if (!isFigureFitsField()) {
            _state.col++;
            return false;
        }
        return true;
    }

    public boolean moveRight() {
        _state.col++;
        if (!isFigureFitsField()) {
            _state.col--;
            return false;
        }
        return true;
    }

    public boolean moveDown() {
        _state.row++;
        if (!isFigureFitsField()) {
            _state.row--;
            pasteFigure();
            _state.setFigure(Figure.getRandomFigure());
        }
        return true;
    }

    private void pasteFigure() {
        int[][] figureData = _state.getFigure().getData();
        int[][] fieldData = _state.getField().getData();
        
        for (int r = 0; r < figureData.length; r++) {
            for (int c = 0; c < figureData.length; c++) {
                if (figureData[r][c] == 0) {
                    continue;
                }
                fieldData[_state.row + r][_state.col + c] = figureData[r][c];
            }
        }
    }

    public boolean dropDown() {
        _state.row = _state.getField().getHeigth() - 4;
        return true;
    }

    public void rotate() {
        //TODO
    }



    public boolean isFigureFitsField() {
        int[][] data = _state._figure._data;
        
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[0].length; c++) {
                if (data[r][c] == 0) {
                    continue;
                }
                int row = _state.row + r;
                int col = _state.col + c;
                
                if (col < 0 || row < 0 ||row >= _state._field.getHeigth() || col >= _state._field.getWidth()) {
                    return false;
                }
                
                if (_state._field._data[row][col] > 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public State getState() {
        try {
            return (State)_state.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
