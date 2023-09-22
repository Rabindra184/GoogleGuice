package emart2;

/**
 * @author Rabindra Biswal
 * @since 22/09/23 12:31 pm
 */

public class GroceryModule {
    private FetchGrocery fetchGrocery;
    private FetchVeg fetchVeg;
    private final ExportToMarket exportToMarket = new ExportToMarket();


    public void process(int input) {
        if (input == 1) {
            fetchGrocery = new FetchGrocery();
            fetchGrocery.fetch();
        } else {
            fetchVeg = new FetchVeg();
            fetchVeg.fetch();
        }
        exportToMarket.export();
    }
}
