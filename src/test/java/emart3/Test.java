package emart3;

/**
 * @author Rabindra Biswal
 * @since 22/09/23 2:25 pm
 */

public class Test {

    public static void main(String[] args) {
        GroceryModule module=new GroceryModule();
        module.configureExport("FLIPKART");
        module.configureFetch("VEG");
        module.process();

    }
}
