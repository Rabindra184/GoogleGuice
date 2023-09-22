package ex6;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 5:55 pm
 */

public class ConnectDBImpl implements ConnectDB {

    private String dbUrl;

    @Inject
    public ConnectDBImpl(@Named("JDBC") String dbUrl){
        this.dbUrl = dbUrl;

    }

    @Override
    public void checkDBConnection() {
        System.out.println("Inside checkSpelling." );
        System.out.println(dbUrl);
    }
}
