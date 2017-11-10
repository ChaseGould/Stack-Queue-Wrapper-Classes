import java.util.Scanner;

public class Stack <T> implements myStack <T>{
	
	
	//Stack fields
	private DoublyLinkedList linky;
	
	//Stack constructors
	public Stack() //creates an empty stack
	{
		this.linky = new DoublyLinkedList();
	}
	
	public Stack(Object [] objectArray) 
	{ //create a stack with an array as input
		this.linky = new DoublyLinkedList(objectArray);
	}
	
	//Stack methods
	public void push(T input) 
	{
		this.linky.addToFrontofList(input);
	}
	
	public T pop()
	{
		return (T) this.linky.removeFromFront();
	}
	
	public T peek() 
	{
		return (T) this.linky.peekFront(); //getHead is a method from DoublyLinkedlist, getContent is method from DNode
		
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
	
	//getter for stack type
	public DoublyLinkedList getLinky()
	{
		return linky;
	}


	 
	 
}