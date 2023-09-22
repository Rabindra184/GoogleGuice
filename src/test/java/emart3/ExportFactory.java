package emart3;

/**
 * @author Rabindra Biswal
 * @since 22/09/23 2:18 pm
 */

public class ExportFactory {

    public static Export getExportData(String type) {
        Export export = null;
        if ("FLIPKART".equalsIgnoreCase(type)) {
            export = new ExportToFlipkart();
        } else if ("MARKET".equalsIgnoreCase(type)) {
            export = new ExportToMarket();
        } else {
            return null;
        }
        return export;
    }
}
