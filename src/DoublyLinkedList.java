import java.util.Scanner;

public class DoublyLinkedList {
		 
		protected DNode head;
		private DNode tail;
		private int size;

		public DoublyLinkedList () // construct an empty list
		{
			this.tail = new DNode (null, null, null);
			this.head = new DNode (null, this.tail, null);
			this.tail.changePrev(this.head);
			this.size = 0;
		}

		public DoublyLinkedList (DNode next) // constructs a list
		// out of a single node
		{
			this.tail = new DNode (null, null, next);
			this.head = new DNode (null, next, null);
			next.changeNext(this.tail);
			next.changePrev(this.head);
			this.size = 1;
		}

		public DoublyLinkedList(Object [] objectArray) // construct a list out of
		// an array
		{
			this.tail = new DNode (null, null, this.head);
			this.head = new DNode (null, this.tail, null);
			DNode temp = this.head;

			for (Object e : objectArray)
			{
				
			//Anonomus function
			new DNode (e, temp.getNext(),temp).insertBetweenNodes(temp, temp.getNext());
			temp = temp.getNext();
			this.size += 1;
			}
		}

		public void addToFrontofList (Object toAdd) // Appends the begining
		// of the list
		{
			DNode temp = new DNode(toAdd, this.head.getNext(), this.head);
			this.head.getNext().changePrev(temp);
			this.head.changeNext(temp);
			this.size += 1;
		}
		
		public Object removeFromFront()
		{
			Object result = head.getNext().removeNode();
			this.size -= 1;
			return result;
		}

		public void addToendofList (Object toAdd) // appends the end of the list
		// with a node
		{
			DNode temp = new DNode (toAdd, this.tail, this.tail.getPrev());
			this.tail.getPrev().changeNext(temp);
			this.tail.changePrev(temp);
			this.size += 1;
		}

		public void insertAfterNode(DNode current, Object input)// Inserts a new
		// a new node after
		// current node
		{	DNode node = new DNode(input);
			current.insertAfterNode(node);
			this.size += 1;
		}
		
		//This method written by Chase
		public Object peekFront()
		{
			return this.head.getNext().getContent();
		}
		
		//This method written by Chase
		public Object peekBack()
		{
			return this.getTail().getPrev().getContent();
		}
		
		public Object finder(int x)
		{
			
			x = inputValidation(x, 0, this.size);
			DNode temp = this.getHead();
			for(int i = 0; i <= x; i += 1)
			{
				temp = temp.getNext();
			}
			return temp.getContent();
			}
		

		public int getSize() // returns the size of the list
		{
			return this.size;
		}
		
		//setter increments size written by Chase
		public void incrementSize()
		{
			this.size += 1;
		}

		@Override
		public String toString()
		{
			String result = "";
			for (DNode temp = this.head.getNext();
			temp.hasNext(); temp = temp.getNext())
			{
				
				result += temp.getValue();
				result += " -> ";
			}

			result += "End of list";
			return result;
		}
		
		public boolean isEmpty()
		{
			int size = this.getSize();
			if (size == 0) {
				return true;
			}
			else {
				return false;
			}
		}
		
		//setter/getters written by me
		public DNode getHead() 
		{
			return this.head;
		}
		
		public DNode getTail()
		{
			return this.tail;
		}
		
	
		
		public int inputValidation(int x, int min, int max)
		{
			Scanner input = new Scanner(System.in);
			while (x >= max || x < min)
			{
				System.out.println("Invalid index, try again");
				x = input.nextInt();
			}
			return x;
		}
		
	 }// end of LinkedList class

