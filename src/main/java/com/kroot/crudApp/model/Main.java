/*
package com.kroot.crudApp.model;

import com.kroot.crudApp.model.Attribute;
import com.kroot.crudApp.model.Box;
import com.kroot.crudApp.model.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

    public static void main(String[] args) {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();


        Attribute attribute1 = new Attribute("purple");
        Attribute attribute2 = new Attribute("pink");

        Box box1 = new Box("Big Box");
        Box box2 = new Box("Little Box");

        box1.getAttributes().add(attribute1);
        box1.getAttributes().add(attribute2);
        box2.getAttributes().add(attribute1);

        session.save(box1);
        session.save(box2);

        session.getTransaction().commit();
        session.close();
    }
}*/
