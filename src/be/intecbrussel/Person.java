package be.intecbrussel;

import java.time.LocalDate;
import java.util.Objects;

public class Person{
    public String firstName;
    public String lastName;
    public LocalDate dateofBirth;

    //Constructor


    public Person() {

    }

    public Person(String firtName, String lastName, LocalDate dateOfBirth) {
        this.firtName = firtName;
        this.lastName = lastName;
        this.dateofBirth = dateofBirth;
    }


    //getters

    public String getFirtName() {
        return firtName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateofBirth() {
        return dateofBirth;
    }

    //Equals and hashcode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getFirtName().equals(person.getFirtName()) && getLastName().equals(person.getLastName()) && getDateofBirth().equals(person.getDateofBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirtName(), getLastName(), getDateofBirth());
    }
}
