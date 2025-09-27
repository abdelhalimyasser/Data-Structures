import mypackage;

// The LinkedStack Implementation
public class LinkedStack{
    int size = 0;     // the counter of LinkedStack
    Node top = null;   
    
    // push function to insert elements in the stack at the top
    public void push(int element){
        Node temp = new Node(element);   // temp node to store the first element
        temp.next = top;       // make the assign the next to the temp 
        top = temp;          //  assign the temp to the top
        size++;        // counter to increase the size of the Stack
    }
    
    // pop function to remove the last element
    public int pop(){
        // condation to check if the stack is empty or not
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        
        Node temp = top;    // copy the top into temp node
        top = top.next;       // assign the next of the top into top to make the pointer look at the next 
        size--;       // decrease the counter after removing the element
        
        return temp.data;     // return the last element
    }
    
    // peek function to return the last element without removing it
    public int peek(){
        // condation to check if the stack is empty or not
        if (top == null)      
            return -1;
        return top.data;    // return the top element in the stack
    }
    
    // size function to return the size of the stack
    public int size(){
        // condation to check if the stack is empty or not
        if (top == null)
            return -1;
        return size;    // return the size of the stack
    }

     // Prints the stack elements with indices
    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack:");
        Node current = top;
        int index = 0;
        while (current != null) {
            System.out.println("[" + index++ + "] -> " + current.data);
            current = current.next;
        }
    }
    
    // isEmpty function to check if stack is full or not
    public boolean isEmpty(){
        // condation to check if the stack is empty or not
        if(top == null)
            return true;
        return false;        // return false if the stack is full
    }
    
    // isFull function to check if stack is full or not
    public boolean isFull(){
        // condation to check if the stack is empty or not
        if(top == null)
            return false;
        return true;            // return true if the stack is full
    }

    // Clears all nodes in the stack
    public void clear() {
        top = null;
        size = 0;
    }
}
