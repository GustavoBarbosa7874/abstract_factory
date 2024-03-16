package refactoring_guru.abstract_factory.example.factories;

import refactoring_guru.abstract_factory.example.buttons.Button;
import refactoring_guru.abstract_factory.example.buttons.MacOSButton;
import refactoring_guru.abstract_factory.example.checkboxes.Checkbox;
import refactoring_guru.abstract_factory.example.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() { // Método para criar um botão no estilo MacOS
        return new MacOSButton(); // Retorna uma instância de MacOSButton
    }

    @Override
    public Checkbox createCheckbox() { // Método para criar um checkbox no estilo MacOS
        return new MacOSCheckbox(); // Retorna uma instância de MacOSCheckbox
    }
}
