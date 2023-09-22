package emart;

/**
 * @author Rabindra Biswal
 * @since 22/09/23 12:31 pm
 */

public class GroceryModule {
    private final FetchGrocery fetchGrocery = new FetchGrocery();
    private final ExportToMarket exportToMarket = new ExportToMarket();

    public void process() {
        fetchGrocery.fetch();
        exportToMarket.export();
    }
}
