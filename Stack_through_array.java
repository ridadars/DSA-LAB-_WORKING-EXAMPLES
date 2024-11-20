package dsa_lab;

/**
 *
 * @author Rida
 */
public class Stack_through_array {
    private int[] arr;
    private int size;
    private int index = 0;

    public Stack_through_array(int size) {
        this.size = size;
        arr = new int[size];
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + element);
            return;
        }
        arr[index] = element;
        index++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; 
        }
        return arr[--index];
    }

    public boolean isEmpty() {
        return index == 0;
    }

    // Check if the stack is full
    public boolean isFull() {
        return index == size;
    }

    public int currentSize() {
        return index;
    }

    public static void main(String[] args) {
        Stack_through_array stack = new Stack_through_array(5);

        stack.push(8);
        stack.push(11);
        stack.push(13);
        stack.push(20);
        stack.push(11);
        stack.push(25);

        System.out.println("1. Size of stack after push operations: " + stack.currentSize());

        System.out.print("2. Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println("\n3. Size of stack after pop operations: " + stack.currentSize());
    }
}
