package ex2.model;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 4:08 pm
 */

public class CarDriving {
    private final Car car;

//    @Inject
//    public CarDriving(@ex2.model Car car) {
//        this.car = car;
//    }
     @Inject
    public CarDriving(@Named("model")Car car){
        this.car=car;
    }
    public void driveCar() {
        car.drive();
    }
}
