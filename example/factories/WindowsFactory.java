package refactoring_guru.abstract_factory.example.factories;

import refactoring_guru.abstract_factory.example.buttons.Button;
import refactoring_guru.abstract_factory.example.buttons.WindowsButton;
import refactoring_guru.abstract_factory.example.checkboxes.Checkbox;
import refactoring_guru.abstract_factory.example.checkboxes.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() { // Método para criar um botão no estilo Windows
        return new WindowsButton(); // Retorna uma instância de WindowsButton
    }

    @Override
    public Checkbox createCheckbox() { // Método para criar um checkbox no estilo Windows
        return new WindowsCheckbox(); // Retorna uma instância de WindowsCheckbox
    }
}

