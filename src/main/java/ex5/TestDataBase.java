package ex5;

import com.google.inject.Inject;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 5:54 pm
 */

public class TestDataBase {
    private ConnectDB connectDB;
    @Inject
    public TestDataBase(ConnectDB connectDB) {
        this.connectDB = connectDB;
    }
    public void makeSpellCheck(){
        connectDB.checkDBConnection();
    }
}
