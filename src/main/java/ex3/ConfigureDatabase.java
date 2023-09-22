package ex3;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 4:42 pm
 */

public class ConfigureDatabase {
    private String dbUrl;

    @Inject
    public ConfigureDatabase(@Named("JDBC") String dbUrl) {
        this.dbUrl = dbUrl;
    }
    public void makeConnection(){
        System.out.println(dbUrl);
    }
}
