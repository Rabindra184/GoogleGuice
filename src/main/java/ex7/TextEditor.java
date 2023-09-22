package ex7;

import com.google.inject.Inject;

import java.util.logging.Logger;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 6:20 pm
 */

public class TextEditor {
    private Logger logger;

    @Inject
    public TextEditor( Logger logger) {
        this.logger = logger;
    }

    public void makeSpellCheck(){
        logger.info("In TextEditor.makeSpellCheck() method");
    }
}
