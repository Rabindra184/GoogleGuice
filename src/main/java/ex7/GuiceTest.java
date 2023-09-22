package ex7;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Rabindra Biswal
 * @since 20/09/23 6:21 pm
 */

public class GuiceTest {

    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor editor = injector.getInstance(TextEditor.class);
        editor.makeSpellCheck();
    }
}
