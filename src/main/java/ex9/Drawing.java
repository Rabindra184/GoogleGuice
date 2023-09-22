package ex9;

import com.google.inject.Inject;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 6:36 pm
 */

public class Drawing {
    @Inject
    public Square square;

    public void makeDrawing(){
        square.draw();
    }
}
