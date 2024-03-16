package refactoring_guru.abstract_factory.example.factories;

import refactoring_guru.abstract_factory.example.buttons.Button;
import refactoring_guru.abstract_factory.example.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */

public interface GUIFactory {
    Button createButton(); // Método para criar um botão
    Checkbox createCheckbox(); // Método para criar um checkbox
}
