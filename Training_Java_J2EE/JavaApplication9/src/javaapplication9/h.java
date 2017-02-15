/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cc4
 */
public class h {
    public void count()
    {
        int i;
         for(i=10;i!=0;i--)
        {
            try {
                System.out.println(+i);
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(JavaApplication9.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
