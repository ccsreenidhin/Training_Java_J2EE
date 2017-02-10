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
public class Javard {
    
    public void read()
	{
		try
		{
		FileInputStream fin= new FileInputStream("C:/eclipse/workspace/newfile.txt");
		
		int i=0;
		while((i=fin.read())!=-1)
		{
		System.out.println((char)i);
		}
		
		fin.close();
		
		}catch (Exception e){
			e.printStackTrace();
		};
		
    
}
}
