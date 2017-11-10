import java.util.Scanner;

public class Queue <T> implements myQueue <T> {


	//Queue fields
	private DoublyLinkedList linky;
	
	//Queue constructors
	public Queue() //creates an empty stack
	{
		this.linky = new DoublyLinkedList();
	}
	
	public Queue(Object [] objectArray) 
	{ //create a stack with an array as input
		this.linky = new DoublyLinkedList(objectArray);
	}
	
	//Queue methods
    public void enqueue(T input)
    {
    	this.linky.addToendofList(input);
    }
 
    public T dequeue()
    {
    	return (T) this.linky.removeFromFront();
    }
    
    public T front()
    {
    	return (T) this.linky.peekFront();
    }
    
    public T back()
    {
    	return (T) this.linky.peekBack();
    }
    
    public T atIndex(int x)
	{
		return (T) this.linky.finder(x);
	}
    
	public int size()
	{
		return this.linky.getSize();
	}
    
	public boolean isEmpty()
	{
		return this.linky.isEmpty();
	}
    
	public void empty()
	{
		this.linky = new DoublyLinkedList();
	}
	
	//getter for queue type
	public DoublyLinkedList getLinky()
	{
		return linky;
	}
	
	 
	 
}
