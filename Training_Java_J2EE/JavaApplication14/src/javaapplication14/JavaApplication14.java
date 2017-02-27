/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author cc4
 */
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       student s1= new student(12,12,"ads");
       student s2= new student(15,13,"dfg");
       student s3= new student(18,19,"ert");
       
       ArrayList<student> al=new ArrayList<student>();
       al.add(s1);
       al.add(s2);
       al.add(s3);
       
       Iterator itr=al.iterator();
       while(itr.hasNext())
       {
           student st=(student)itr.next();
           System.out.println(st.roll+" "+st.age+" "+st.name);
       }
    }
    
}
