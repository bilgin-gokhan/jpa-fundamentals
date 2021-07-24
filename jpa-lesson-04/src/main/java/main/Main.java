package main;

import entities.Building;
import entities.Person;
import entities.embeddables.BuildingPK;

import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        var em = emf.createEntityManager();

        em.getTransaction().begin();

//        Company c = new Company();
//        c.setName("C1");
//        c.setAddress(new Address());
//
//        c.getAddress().setCity("My City");
//        c.getAddress().setStr("Some Street");
//        c.getAddress().setNo("7");
//        em.persist(c);

//        Department d = new Department();
//        d.setName("DEP 1");
//        d.setCode("QWE");
//        d.setNo(10);
//        em.persist(d);

//        Building b = new Building();
//        b.setName("B1");
//        b.setId(new BuildingPK());
//        b.getId().setCode("ABC");
//        b.getId().setNo(20);
//        em.persist(b);

        Person p1 = new Person();
        p1.setName("P1");
        em.persist(p1);

        em.getTransaction().commit();
        em.close();
    }
}
