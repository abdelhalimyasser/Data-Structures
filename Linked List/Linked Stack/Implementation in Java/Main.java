import mypackage;

public class Main
{
	public static void main(String[] args) {
		LinkedStack st = new LinkedStack();

        // pushing elements
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        // popping one element
        System.out.println("Popped: " + st.pop());

        // checking top element
        System.out.println("Top element: " + st.peek());
        
        // checking current size
        System.out.println("Current size: " + st.size());
        
        // checking if stack is empty
        System.out.println("Is stack empty: " + (st.isEmpty() ? "Yes" : "No"));
        
        // checking if stack is full
        System.out.println("Is stack full: " + (st.isFull() ? "Yes" : "No"));
	}
}
