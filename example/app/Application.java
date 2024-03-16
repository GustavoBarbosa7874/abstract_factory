package refactoring_guru.abstract_factory.example.app;

import refactoring_guru.abstract_factory.example.buttons.Button;
import refactoring_guru.abstract_factory.example.checkboxes.Checkbox;
import refactoring_guru.abstract_factory.example.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button; // Armazena o botão criado pela fábrica
    private Checkbox checkbox; // Armazena o checkbox criado pela fábrica

    public Application(GUIFactory factory) { // Construtor da aplicação que recebe uma fábrica
        button = factory.createButton(); // Cria um botão usando a fábrica fornecida
        checkbox = factory.createCheckbox(); // Cria um checkbox usando a fábrica fornecida
    }

    public void paint() { // Método para renderizar os componentes
        button.paint(); // Renderiza o botão
        checkbox.paint(); // Renderiza o checkbox
    }
}
