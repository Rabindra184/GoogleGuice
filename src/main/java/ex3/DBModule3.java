package ex3;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 4:44 pm
 */

public class DBModule3 extends AbstractModule {

    @Override
    protected void configure() {
        bind(String.class).annotatedWith(Names.named("JDBC")).toInstance("jdbc:mysql://localhost:5326/test");
    }
}
