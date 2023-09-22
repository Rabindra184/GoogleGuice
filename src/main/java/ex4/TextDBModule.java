package ex4;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 5:54 pm
 */

public class TextDBModule extends AbstractModule {

    @Override
    protected void configure() {}

    @Provides
    public ConnectDB provideSpellChecker(){

        String dbUrl = "jdbc:mysql://localhost:5326/emp";
        String user = "user";
        int timeout = 100;

        ConnectDB SpellChecker = new ConnectDBImpl(dbUrl, user, timeout);
        return SpellChecker;
    }
}
