

public interface myStack <T> {
   
    /**
     *  push (E): Add an element to the start of the sequence
     * @param element an element that you are to push on to the stack
     */
    public void push (T element);
    
    /**
     * pop: Remove an element from the start of the sequence
     * @return returns the element that has been popped
     */
    public T pop ();
    
    /**
     * Peek: Return the first element of the sequence without removing it
     * @return the first element of the sequence
     */
    public T peek();
    
    /**
     * atIndex(x): Return the element at the given index (x)
     * Or throw an exception if it is out of bound 
     * (if you can control the user input then do that instead)
     * @param x the index of the Element within the sequence
     * @return the Element being returned
     */
    public T atIndex(int x);
    
    /**
     * Size: Return the size of the Stack
     * @return the size of the object
     */
    public int size();
    
    /**
     * isEmpty: Boolean, returns true if the Stack is empty
     * @return a boolean which states if the collection is 
     * empty or populated
     */
    public boolean isEmpty();
    
    /**
     * Empty: Empty the Stack
     */
    public void empty();

	
}
