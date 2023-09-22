package ex11;

/**
 * @author Rabindra Biswal
 * @since 21/09/23 8:09 am
 */

public class SpellCheckerImpl implements SpellChecker{
    @Override @CallTracker
    public void checkSpelling() {
        System.out.println("Inside checkSpelling." );
    }
}
