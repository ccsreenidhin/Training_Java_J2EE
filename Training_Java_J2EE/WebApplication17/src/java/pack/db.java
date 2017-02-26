/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;


import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author cc4
 */
public class db {
    
    Session ss;
    Transaction t;
    public db(){
        ss=NewHibernateUtil.getSessionFactory().openSession();
    }
    
    public void insert(Student st){
        
        t=ss.beginTransaction();
        ss.save(st);
        t.commit();
    }
    
    public List select()
    {
        List s;
        t=ss.beginTransaction();
        Query q=ss.createSQLQuery("select name from student");
        s=q.list();
        t.commit();
        return s;
    }
    
    public void delete(Student st)
    {
        t=ss.beginTransaction();
        Query q=ss.createSQLQuery("delete from student where name='"+st.getName()+"'");
        q.executeUpdate();
        //ss.delete(st);
        t.commit();
    }
    
    public void update(Student st)
    {
        t=ss.beginTransaction();
        Query q=ss.createSQLQuery("update student set rollno='"+st.getRollno()+"',phno='"+st.getPhno()+"',email='"+st.getEmail()+"',address='"+st.getAddress()+"' where name='"+st.getName()+"'");
        q.executeUpdate();
        t.commit();
        
    }
    
}
