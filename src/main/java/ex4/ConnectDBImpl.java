package ex4;

import com.google.inject.Inject;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 5:55 pm
 */

public class ConnectDBImpl implements ConnectDB {

    private String dbUrl;
    private String user;
    private Integer timeout;

    @Inject
    public ConnectDBImpl(String dbUrl,
                         String user,
                         Integer timeout){
        this.dbUrl = dbUrl;
        this.user = user;
        this.timeout = timeout;
    }

    @Override
    public void checkDBConnection() {
        System.out.println("Inside checkSpelling." );
        System.out.println(dbUrl);
        System.out.println(user);
        System.out.println(timeout);
    }
}
