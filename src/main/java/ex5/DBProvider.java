package ex5;

import com.google.inject.Provider;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 6:07 pm
 */

public class DBProvider implements Provider<ConnectDB> {

    @Override
    public ConnectDB get() {
        String dbUrl = "jdbc:mysql://localhost:5326/emp";
        String user = "user";
        int timeout = 100;
        ConnectDB SpellChecker = new ConnectDBImpl(dbUrl, user, timeout);
        return SpellChecker;
    }
}
