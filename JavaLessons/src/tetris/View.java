package tetris;

public class View {

    final static int BOX_SIZE = 30;
    final static int ORIGIN_X = 30;
    final static int ORIGIN_Y = 30;

    private Graphics _graphics;

    public void setGraphics(final Graphics graphics) {
        _graphics = graphics;
    }
    public void draw(final State state) {
        drawField(state.getField().getData());
        drawFigure(state.getFigure().getData(), state.row, state.col);
    }

    private void drawBoxes(final int[][] data, final int row, final int col, boolean drawBackground) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (!drawBackground && data[i][j] == 0) {
                    continue;
                }
                drawBox(data[i][j], row + i, col + j);
            }
        }
    }

    private void drawFigure(final int[][] data, final int row, final int col) {
        drawBoxes(data, row, col, false);
    }

    private void drawField(final int[][] data) {
        drawBoxes(data, 0, 0, true);
    }

    private void drawBox(final int colorIndex, final int row, final int col) {
        _graphics.fillRect(ORIGIN_X + col * BOX_SIZE, ORIGIN_Y + row * BOX_SIZE, BOX_SIZE, BOX_SIZE, colorIndex);
    }

}
