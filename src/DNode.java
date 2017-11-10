public class DNode {
		
		private Object content;
		private DNode prev;
		private DNode next;
		
		//creating a single node
		public DNode(Object input) {
			this.content = input;
			this.next = null; //empty input because there is no next node to follow
		}
		
		public DNode(Object input, DNode next, DNode prev) {
			this.content = input;
			this.prev = prev;
			this.next = next;
		}
		
		public void changeNext (DNode next) // Changes the link to the next node
		{
			this.next = next;
		}
		
		public void changePrev (DNode prev) // Changes the link to the next node
		{
			this.prev = prev;
		}
		
		public DNode getNext(){ // Returns the node next in the sequence
			return this.next;
		}
		
		public Object getValue() // Returns the value a node is holding
		{
			return this.content;
		}
		
		public Boolean hasNext() // Returns a boolean determining regarding
		//the status of subsequent nodes after
		// the current node
		{
			return !(this.next.getValue() == null || this.next == null);
		}
		
		
		public Boolean hasprev() // Returns a boolean determining regarding
		// the status of subsequent nodes after
		// the current node
		{
			return !(this.prev.getValue() == null || this.prev == null);
		}
			
		public void insertAfterNode( Object input)//broken method
		{
			DNode node = new DNode(input);
			node.changeNext(this.next);
			node.changePrev(this);
			node.getNext().changePrev(node);
			node.getPrev().changeNext(node);
			
		}
		
		public Object removeNode() //written by Chase possibly broken
		{
			Object x = this.content;
			this.getNext().changePrev(prev);
			this.getPrev().changeNext(next);
			return this.content;
		}
			
		public void insertAfterNode (DNode input)  //this refers to head, input refers to new node
		{
			input.changeNext(this.next);
			input.changePrev(this);
			input.getNext().changePrev(input);
			this.changeNext(input);
		}
			
		public void insertbeforeNode (DNode input)
		{
			this.changeNext(input);
		}
			
		 public void insertBetweenNodes(DNode before, DNode after)
		{
			this.changeNext(after);
			this.changePrev(before);
			before.changeNext(this);
			after.changePrev(this);
		}
			
		public DNode getPrev()
		{
			return this.prev;
		}
		
		//methods written by me
		public Object getContent() 
		{
			return content;
		}
		
			
	}// end of class



