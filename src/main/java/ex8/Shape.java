package ex8;

import com.google.inject.ImplementedBy;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 6:33 pm
 */
@ImplementedBy(Square.class)
public interface Shape {

    public void draw();
}
