/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackQueue;

/**
 *
 * @author Ken
 */
public class StackQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scenario 1
        int[] Arrays = {20,50,100,1000,10000,100000,1000000};
       
       for(int n: Arrays)
       {
          SSQueue mystack = new SSQueue(); 
          long startTime = System.nanoTime();
          for(int i = 0;i<n; i++){
              mystack.enQueue(i);
          }
          for(int i = 0;i<n; i++){
             mystack.enQueue(i+n);
             mystack.deQueue();
          }
          long EndTime = System.nanoTime();
          long TotalTime = EndTime-startTime;
          System.out.println(n + "\t" + TotalTime);
       }       
        
        System.out.println("\n");
      
                 //Scenario 2
       int[] Array2 = {20,50,100,1000,10000,100000,1000000};
       
       for(int n: Array2)
       {
          SSQueue mystack = new SSQueue(); 
          long startTime = System.nanoTime();
          for(int i = 0;i<n; i++){
              mystack.enQueue(i);
          }
          for(int i = 0;i<n; i++){
              if (Math.random() < 0.5) 
              {
                  mystack.enQueue(i+n);
          }
              else
              {
                  mystack.deQueue();
              }
          }
          long EndTime = System.nanoTime();
          long TotalTime = EndTime-startTime;
          System.out.println(n + "\t" + TotalTime);
       }       
       
       
        
       
    }
    
}
