package com.jay.collection;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Mobile mob1=new Mobile();
    	mob1.setMbrand("Sony");
    	mob1.setModel("Xperia");
    	Mobile mob2=new Mobile();
    	mob2.setMbrand("Nokia");
    	mob2.setModel("Lumia-510");
               
        Person per = new Person();
        per.setPgender('M');
        per.setPname("bro");
        per.getMob().add(mob1);
        per.getMob().add(mob2);
        
        mob1.getPer().add(per);
        
        
        Session ses = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
        Transaction t=ses.beginTransaction();
        
        ses.persist(mob1);
        ses.persist(mob2);
        ses.persist(per);
        
        t.commit();
        ses.close();
    }
}
