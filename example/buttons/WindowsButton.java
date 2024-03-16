package refactoring_guru.abstract_factory.example.buttons;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() { // Implementação do método para renderizar um botão no estilo Windows
        System.out.println("You have created WindowsButton."); // Exibe uma mensagem indicando que um botão no estilo Windows foi criado
    }
}
