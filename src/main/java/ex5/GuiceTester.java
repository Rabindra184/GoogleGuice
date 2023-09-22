package ex5;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 5:53 pm
 */

public class GuiceTester {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextDBModule());
        TestDataBase editor = injector.getInstance(TestDataBase.class);
        editor.makeSpellCheck();
    }
}
