/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackQueue;

import java.util.ArrayList;
import java.util.NoSuchElementException;

/**
 *
 * @author Ken
 */
public class MyStack {
    //private int counter = 0;
    ArrayList<Integer> stack1;
    
    
    public MyStack(){
        
        stack1 = new ArrayList<Integer>();
    }
    
    public void push(int value){
            stack1.add(value);
           
        }
    
    public int pop(){
        int value = 0;
        if(stack1.size() ==0 ){
            throw new NoSuchElementException();
        }
       return stack1.remove((stack1.size()-1));   
    }
    
    public int size(){
      return stack1.size();  
    }
    
    public boolean isEmpty(){
       boolean status = false;
       if(stack1.size() <=0){
           status = true;
       }
       
           
        return status;
    }
    
    
}
