
import java.rmi.Naming;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cc4
 */
public class MyClient {
 public static void main(String[] args){
   

     try{
     Adder stub=(Adder)Naming.lookup("rmi://172.17.1.29:5019/good");
	frame1 f=new frame1();
	f.setVisible(true);
  
    // System.out.println(stub.add(34,4));
     }catch(Exception e){}
 }   
}
