package pack;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cc4
 */
public class habdler extends TagSupport{
    private String name; 
    public void setstar(String name)
    {
      this.name=name; 
    }
    
  @Override
  public int doStartTag()throws JspException{
     JspWriter out=pageContext.getOut();
     try{
         out.print("xbc zbnxc bz"+name);
    
     } catch (IOException ex) {
          Logger.getLogger(habdler.class.getName()).log(Level.SEVERE, null, ex);
      }
      return SKIP_BODY;
 
}
}

