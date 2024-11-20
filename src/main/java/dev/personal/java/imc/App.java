package dev.personal.java.imc;

import dev.personal.java.imc.controller.ViewController;
import dev.personal.java.imc.models.ImcModel;
import dev.personal.java.imc.models.Person;
import dev.personal.java.imc.view.View;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        View view = new View();
        Person person = new Person(0, 0); 
        ImcModel imcModel = new ImcModel(person);
        ViewController controller = new ViewController(view, imcModel); 
        
        controller.startApp();

        view.closeScanner();

    }
}
