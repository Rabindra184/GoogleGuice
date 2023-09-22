package ex11;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * @author Rabindra Biswal
 * @since 21/09/23 8:07 am
 */

public class GuiceTest {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor editor = injector.getInstance(TextEditor.class);
        editor.makeSpellCheck();
    }
}
