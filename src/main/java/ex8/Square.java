package ex8;

import com.google.inject.ImplementedBy;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 6:34 pm
 */

public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("This is square");
    }
}
