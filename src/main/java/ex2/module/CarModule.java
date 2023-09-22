package ex2.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import ex2.model.BmwX5;
import ex2.model.Car;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 4:11 pm
 */

public class CarModule extends AbstractModule {


    @Override
    protected void configure() {
        bind(Car.class).annotatedWith(Names.named("model")).to(BmwX5.class);
//       bind(Car.class).annotatedWith(ex2.model.class).to(BmwX5.class);
//       bind(Bmw.class).to(BmwX5.class);

    }
}
