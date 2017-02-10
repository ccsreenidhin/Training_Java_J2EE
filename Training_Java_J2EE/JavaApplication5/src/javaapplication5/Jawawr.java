/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication5;

/**
 *
 * @author cc4
 */
public class Jawawr {
  
    public void write()
    {
                try{
			Fin f=new Fin();
			FileOutputStream fout= new FileOutputStream("C:/eclipse/workspace/newfile.txt");
			String s="welcome to";
			byte b[]=s.getBytes();
		
			
			fout.write(b);
			
			fout.close();
	
		f.read();
		}catch (Exception e){
			e.printStackTrace();
		};
		
		
		
		
	}

}
