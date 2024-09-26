package kr.co.shinhands.edu.aidev;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class PersonTest {

    @Test
    void testPersonNameChange() {
        Person person = new Person("밥 스미스", 40);
        person.setName("로버트 스미스");
        Assertions.assertEquals("로버트 스미스", person.getName());
    }

    @Test
    void testPersonToString() {
        Person person = new Person("Alice Johnson", 35);
        Assertions.assertEquals(person.getName(), "Alice Johnson");
    }

    @Test
    void testPersonWithNegativeAge() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Person("Invalid", -5));
    }

    @Test
    void testPersonWithNullName() {
        Assertions.assertThrows(NullPointerException.class, () -> new Person(null, 20));
    }
}