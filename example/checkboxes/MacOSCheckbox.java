package refactoring_guru.abstract_factory.example.checkboxes;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 */
public class MacOSCheckbox implements Checkbox {

    @Override
    public void paint() { // Implementação do método para renderizar um checkbox no estilo MacOS
        System.out.println("You have created MacOSCheckbox."); // Exibe uma mensagem indicando que um checkbox no estilo MacOS foi criado
    }
}
