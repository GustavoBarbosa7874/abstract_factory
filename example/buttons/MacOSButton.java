package refactoring_guru.abstract_factory.example.buttons;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 */
public class MacOSButton implements Button {

    @Override
    public void paint() { // Implementação do método para renderizar um botão no estilo MacOS
        System.out.println("You have created MacOSButton."); // Exibe uma mensagem indicando que um botão no estilo MacOS foi criado
    }
}
