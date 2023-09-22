package ex10;

import com.google.inject.Inject;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 6:36 pm
 */

public class Drawing {

    public Square square;

    @Inject
    public Drawing(Square square) {
        this.square = square;
    }
    public void makeDrawing() {
        square.draw();
    }
}
