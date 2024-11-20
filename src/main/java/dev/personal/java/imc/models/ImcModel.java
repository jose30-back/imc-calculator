package dev.personal.java.imc.models;

public class ImcModel {

    public ImcModel(Person person) {
    }

    public double calculatorBmi(Person person) {
        double weight = person.getWeight();
        double height = person.getHeight();
        return weight / Math.pow(height, 2);
    }

    public String bmiCategory(double bmi) {

        if (bmi < 16) {
            return "Delgadez";
        } else if (bmi < 17) {
            return "Delgadez moderada";
        } else if (bmi < 18.5) {
            return "Delgadez leve";
        } else if (bmi < 25) {
            return "Peso normal";
        } else if (bmi < 30) {
            return "Sobrepeso";
        } else if (bmi < 35) {
            return "Obesidad leve";
        } else if (bmi < 40) {
            return "Obesidad moderada";
        } else {
            return "Obesidad mórbida";
        }
    }
}
