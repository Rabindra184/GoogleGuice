package emart3;

/**
 * @author Rabindra Biswal
 * @since 22/09/23 2:14 pm
 */

public class GroceryModule {
    private Export export;
    private Fetch fetch;

    public void configureFetch(String type) {
        this.fetch = FetchFactory.getFetchData(type);
    }

    public void configureExport(String type) {
        this.export = ExportFactory.getExportData(type);
    }
    public void process() {
        fetch.fetch();
        export.export();
    }
}
