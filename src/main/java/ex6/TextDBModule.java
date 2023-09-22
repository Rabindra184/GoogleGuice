package ex6;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;


/**
 * @author Rabindra Biswal
 * @since 20/09/23 5:54 pm
 */

public class TextDBModule extends AbstractModule {

    @Override
    protected void configure() {

        try {
            bind(ConnectDB.class).toConstructor(ConnectDBImpl.class.getConstructor(String.class));
        } catch (NoSuchMethodException | SecurityException e) {
            System.out.println("Required constructor missing");
        }
        bind(String.class).annotatedWith(Names.named("JDBC")).toInstance("jdbc:mysql://localhost:5326/emp");
    }
}


