import mypackage;

public class Main {
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        
        // pushing elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Stack after pushes: ");
        stack.print();

        System.out.println("\nTop element: " + stack.peek());

        // popping one element
        System.out.println("Popped element: " + stack.pop());

        System.out.println("\nStack after pop: ");
        stack.print();
        
        // checking current size
        System.out.println("\nCurrent size: " + stack.size());
        
        // checking if stack is empty
        System.out.println("Is stack empty: " + (stack.isEmpty() ? "Yes" : "No"));

        // checking if stack is full
        System.out.println("Is stack full: " + (stack.isFull() ? "Yes" : "No"));
        
        stack.clear();
        System.out.println("\nAfter Clear:");
        
        // checking current size
        System.out.println("\nCurrent size: " + stack.size());
        
        // checking if stack is empty
        System.out.println("Is stack empty: " + (stack.isEmpty() ? "Yes" : "No"));
    }
}
