package org.example;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class PersonsList {
    private List<Person> persons;

    public PersonsList() {
        this.persons = new ArrayList<>();
    }

    public Person findByName(String n)  {
        if (n.split(" ").length != 2)
            throw new IllegalArgumentException("Invalid name format. It should be 'firstName lastName'.");

        for (Person p : persons) {
            if (p.getName().equals(n)) {
                return p;
            }
        }
        return null;
    }

    public Person clone(Person p) {
        return new Person(UUID.randomUUID().hashCode(), p.getName(), p.getAge(), p.getOccupation());
    }

    public void writePersonToFile (Person p) {
        try{
            FileWriter fileWriter = new FileWriter("person.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(p.toString());
            printWriter.close();
        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }

    }

    //ARRAYLIST METHODS
    public List<Person> getList(){
        return persons;
    }



}
