import mypackage;

// The LinkedStack Implementation
class LinkedStack{
    int size = 0;     // the counter of LinkedStack
    Node top = null;   
    
    // push function to insert elements in the stack at the top
    public void push(int element){
        Node temp = new Node(element);   // temp node to store the first element
        temp.next = top;       // make the assign the next to the temp 
        top = temp;          //  assign the temp to the top
        size++;        // counter to decrease the size of the Stack
    }
    
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
    
    public int peek(){
        // condation to check if the stack is empty or not
        if (top == null)      
            return -1;
        return top.data;    // return the top element in the stack
    }
    
    public int size(){
        // condation to check if the stack is empty or not
        if (top == null)
            return -1;
        return size;    // return the size of the stack
    }
    
    public boolean isEmpty(){
        // condation to check if the stack is empty or not
        if(top == null)
            return true;
        return false;        // return false if the stack is full
    }
    
    public boolean isFull(){
        // condation to check if the stack is empty or not
        if(top == null)
            return false;
        return true;            // return true if the stack is full
    }
}
