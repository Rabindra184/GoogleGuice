package ex2;

import com.google.inject.Guice;
import com.google.inject.Injector;
import ex2.model.CarDriving;
import ex2.module.CarModule;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 4:13 pm
 */

public class GuiceDemo {


    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new CarModule());
        CarDriving cd = injector.getInstance(CarDriving.class);
        cd.driveCar();
    }

}
