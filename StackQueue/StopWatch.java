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
public class StopWatch {
  
    
    private long ElapsedTime;
    private long StartTime;
    private boolean isRunning;
    
    public void start(){
        if(isRunning)
        {
            return;
        }
        isRunning = true;
        StartTime = System.currentTimeMillis();
    }
    
   
    public long GetTimeElapse(){
        if(isRunning){
            long EndTime = System.currentTimeMillis();
           return ElapsedTime = ElapsedTime + (EndTime-StartTime);
            
        }
        else{
            return ElapsedTime;
        }
    }
    
    public void stop(){
        if(!isRunning)
        {
            return;
        }
        isRunning = false;
        long EndTime = System.currentTimeMillis();
        ElapsedTime =  ElapsedTime + (EndTime-StartTime);
    }
    
    public void reset(){
        StartTime = 0;
        isRunning = false;
    }
    
     public long GetstartTime(){
        return StartTime;
    }
   
    
    public void StopWatch(){
        reset();
    }
    
} 

