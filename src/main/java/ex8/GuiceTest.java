package ex8;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 6:38 pm
 */

public class GuiceTest {

    public static void main(String[] args) {
        Injector inject= Guice.createInjector();
        Drawing drawing=inject.getInstance(Drawing.class);
        drawing.makeDrawing();
    }
}
