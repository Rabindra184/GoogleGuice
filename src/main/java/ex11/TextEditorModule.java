package ex11;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;

/**
 * @author Rabindra Biswal
 * @since 21/09/23 8:15 am
 */

public class TextEditorModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
        bindInterceptor(Matchers.any(),
                        Matchers.annotatedWith(CallTracker.class),
                        new CallTrackerService());
    }
}
