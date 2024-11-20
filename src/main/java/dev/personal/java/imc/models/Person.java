package dev.personal.java.imc.models;

public class Person {
    
    // Atributos de la clase persona 
    private double weight;
    private double height;

    // Constructor 
    public Person(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

     // Getters and Setters 
    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setHeight(double height) {
        this.height = height;
    } 


    


}
