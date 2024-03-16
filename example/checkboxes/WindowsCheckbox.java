package refactoring_guru.abstract_factory.example.checkboxes;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a checkbox.
 */

public class WindowsCheckbox implements Checkbox {

    @Override
    public void paint() { // Implementação do método para renderizar um checkbox no estilo Windows
        System.out.println("You have created WindowsCheckbox."); // Exibe uma mensagem indicando que um checkbox no estilo Windows foi criado
    }
}
