package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonsListTest {

    @Test
    void findByName1() {
        PersonsList personList = new PersonsList();
        Person p = new Person(1, "Jenna Doe", 30, "Software Developer");
        personList.getList().add(p);
        Person foundPerson = personList.findByName("Jenna Doe");
        assertEquals(p, foundPerson);
    }

    @Test
    void findByName2() {
        PersonsList personList = new PersonsList();
        Person p = new Person(1, "Jenna Doe", 30, "Software Developer");
        personList.getList().add(p);
        assertThrows(IllegalArgumentException.class, () -> personList.findByName("Jenna_Doe"));
    }

    @Test
    void testClone() {
        PersonsList personList = new PersonsList();
        Person p = new Person(1, "John Doe", 30, "Software Developer");
        Person clonedPerson = personList.clone(p);
        assertEquals(p.getName(), clonedPerson.getName());
        assertEquals(p.getAge(), clonedPerson.getAge());
        assertEquals(p.getOccupation(), clonedPerson.getOccupation());
        assertNotEquals(p.getId(), clonedPerson.getId());
    }
}
