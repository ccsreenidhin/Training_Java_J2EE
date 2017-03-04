/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author cc4
 */
public class AdderRemote extends UnicastRemoteObject implements Adder{
    
  AdderRemote()throws RemoteException{
      super();
  }  
  public int add(int x,int y)
  {
      return x-y;
  }
}
