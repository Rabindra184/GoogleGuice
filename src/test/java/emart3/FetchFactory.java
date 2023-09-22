package emart3;

/**
 * @author Rabindra Biswal
 * @since 22/09/23 2:18 pm
 */

public class FetchFactory {
    public static Fetch getFetchData(String type) {
        Fetch fetchData = null;
        if ("GROCERY".equalsIgnoreCase(type)) {
            fetchData = new FetchGrocery();
        } else if ("VEG".equalsIgnoreCase(type)) {
            fetchData = new FetchVeg();
        } else {
            return null;
        }
        return fetchData;
    }
}
