package ex8;

import com.google.inject.Inject;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 6:36 pm
 */

public class Drawing {

    public Square square;

    @Inject
    public void setSquare(Square square) {
        this.square = square;
    }

    public void makeDrawing(){
        square.draw();
    }
}
