package ex11;

import com.google.inject.Inject;

/**
 * @author Rabindra Biswal
 * @since 21/09/23 8:08 am
 */

public class TextEditor {

    private SpellChecker spellChecker;

    @Inject
    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck(){
        spellChecker.checkSpelling();
    }
}
