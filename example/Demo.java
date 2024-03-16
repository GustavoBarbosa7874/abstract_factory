package refactoring_guru.abstract_factory.example;

import refactoring_guru.abstract_factory.example.app.Application;
import refactoring_guru.abstract_factory.example.factories.GUIFactory;
import refactoring_guru.abstract_factory.example.factories.MacOSFactory;
import refactoring_guru.abstract_factory.example.factories.WindowsFactory;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {

    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */

    private static Application configureApplication() {
        Application app; // Declaração de uma variável para armazenar a aplicação
        GUIFactory factory; // Declaração de uma variável para armazenar a fábrica de interface gráfica
        String osName = System.getProperty("os.name").toLowerCase(); // Obtém o nome do sistema operacional em que o programa está sendo executado

        // Verifica se o sistema operacional é MacOS
        if (osName.contains("mac")) {
            factory = new MacOSFactory(); // Cria uma fábrica MacOS
        } else {
            factory = new WindowsFactory(); // Caso contrário, cria uma fábrica Windows
        }

        app = new Application(factory); // Cria uma aplicação usando a fábrica determinada
        return app; // Retorna a aplicação configurada
    }

    public static void main(String[] args) {
        Application app = configureApplication(); // Configura a aplicação de acordo com o sistema operacional
        app.paint(); // Renderiza a aplicação
    }

