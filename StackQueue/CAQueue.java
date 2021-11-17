/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackQueue;
import java.util.NoSuchElementException;
import java.util.ArrayList;

/**
 *
 * @author Ken
 */
public class CAQueue {
    private ArrayList<Integer> elements;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    private final static int INITIAL_CAPACITY = 10;
    private final static int DUMMY = -1;
    
    private int[] data;
    
    public CAQueue(){
     elements = new ArrayList<Integer>();
		front = rear = size = 0;
		capacity = INITIAL_CAPACITY;
              }
    
    public boolean isEmpty(){
        return size==0;
    }
    
    public void enQueue(int data) {
		if(rear < elements.size())
			elements.set(rear, data);
		else
			elements.add(data);
		size++;
		rear = (rear+1)%capacity;
		if(capacity == size){//queue is full, needs to grow!
			for (int i = 0; i < capacity;i++) {
				if(i < rear)
					elements.add(DUMMY);
				else
					elements.add(elements.get(i));
			}
			front = rear+capacity;
			capacity *= 2;
		}
    }
    
    public int deQueue() {
		if(isEmpty())
			throw new NoSuchElementException();
		int dequeued = elements.get(front);
		front = (front+1)%capacity;
		size--;
		return dequeued;
	}
}
        