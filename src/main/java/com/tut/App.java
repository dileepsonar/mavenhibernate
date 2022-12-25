package com.tut;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "project started" );
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Student st=new Student();
        st.setId(101);
        st.setName("dileep");
        st.setCity("bidar");
        System.out.println(st);
        Session session =factory.openSession();
        Transaction tx= (Transaction) session.beginTransaction();
        session.save(st);
        session.close();
      
    }
}
