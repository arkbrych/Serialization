package app;

import java.io.Serializable;

/**
 * @Author: Arkadiusz Brych
 * Person contains employee name and surname
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 7925831418382778887L;
    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
