package ex5;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 5:54 pm
 */

public class TextDBModule extends AbstractModule {

    @Override
    protected void configure() {
      bind(ConnectDB.class).toProvider(DBProvider.class);
    }
}
