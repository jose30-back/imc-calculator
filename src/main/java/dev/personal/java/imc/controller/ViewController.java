package dev.personal.java.imc.controller;

import dev.personal.java.imc.models.ImcModel;
import dev.personal.java.imc.models.Person;
import dev.personal.java.imc.view.View;

public class ViewController {

    private View view; 
    private ImcModel imc;

    public ViewController(View view, ImcModel imc) {
        this.view = view;
        this.imc = imc; 
    }
    public void startApp() {
        double weight = view.askWeight();
        double height = view.askHeight(); 

        Person person = new Person(weight, height); 
        imc = new ImcModel(person);

        double bmi = imc.calculatorBmi(person);

        String category = imc.bmiCategory(bmi);

        view.showResults(bmi, category);
    }
}
