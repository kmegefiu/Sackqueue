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
public class SSQueue {
    private MyStack S1;
    private MyStack S2;
    
    public SSQueue(){
        S1 = new MyStack();
        S2 = new MyStack();
    }
    
    public void enQueue(int value){
        S1.push(value);
    }
    
    public int deQueue(){
        if(!S2.isEmpty()){
            return S2.pop();
        }
        while(!S1.isEmpty()){
            S2.push(S1.pop());
        }
        return S2.pop();
    }
    
    
}

