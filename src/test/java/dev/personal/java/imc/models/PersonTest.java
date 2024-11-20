package dev.personal.java.imc.models;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void testSetHeight() {
        Person person = new Person(50, 1.50);
        person.setWeight(45.0);
        assertThat(person.getWeight(), is(45.0));
    }

    @Test
    void testSetWeight() {
        Person person = new Person(50, 1.50);
        person.setHeight(1.60);
        assertThat(person.getHeight(), is(1.60));
    }
}
