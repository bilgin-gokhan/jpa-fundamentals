package main;

import entities.Event;
import entities.Product;

import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        var em = emf.createEntityManager();

        //Product p = new Product();
        //p.setName("Beer");

        Event e1 = new Event();
        e1.setDescription("ABCD");

        em.getTransaction().begin();
        em.persist(e1);
        em.getTransaction().commit();
        em.close();
    }
}
