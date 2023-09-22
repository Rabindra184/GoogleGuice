package ex3;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 4:47 pm
 */

public class GuiceDemo {

    public static void main(String[] args) {

        Injector inject= Guice.createInjector(new DBModule3());
        ConfigureDatabase cd=inject.getInstance(ConfigureDatabase.class);
        cd.makeConnection();
    }
}
