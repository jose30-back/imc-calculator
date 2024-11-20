package dev.personal.java.imc.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class ImcModelTest {
    @Test
    void testBmiCategory() {
        Person person = new Person(65 ,1.75); 
        ImcModel model = new ImcModel(person); 
        String result = model.bmiCategory(22.21);
        assertThat(result, is("Peso normal"));
    }

    @Test
    void testBmiCategory1() {
        Person person = new Person(70 ,1.52); 
        ImcModel model = new ImcModel(person); 
        String result = model.bmiCategory(30.30);
        assertThat(result, is("Obesidad leve"));

    }

    @Test
    void testBmiCategory2() {
        Person person = new Person(90 ,1.50); 
        ImcModel model = new ImcModel(person); 
        String result = model.bmiCategory(40.00);
        assertThat(result, is("Obesidad mórbida"));

    }

    @Test
    void testCalculatorBmi() {
        Person person = new Person(65 ,1.75); 
        ImcModel model = new ImcModel(person); 
        double bmi = model.calculatorBmi(person); 
        assertThat(bmi, closeTo(21.22, 0.01));
    }
}
