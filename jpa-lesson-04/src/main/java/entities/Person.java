package entities;

import javax.persistence.*;

@Entity
@Access(AccessType.PROPERTY)
public class Person {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    // FIELD ACCESS
    private int id;

    private String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // PROPERTY ACCESS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
