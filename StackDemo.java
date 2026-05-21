class Stack {
    int arr[];
    int top;

    Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    void push(int value) {

        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = value;
        }
    }

    void pop() {

        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped Element: " + arr[top]);
            top--;
        }
    }

    void print() {

        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {

            System.out.println("Stack Elements:");

            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }
}

public class StackDemo {
    public static void main(String[] args) {

        Stack s = new Stack(30);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(15);
        s.push(9);

        System.out.println("Initial Stack:");
        s.print();

        System.out.println();

        s.pop();
        s.pop();
        s.pop();

        System.out.println();

        System.out.println("Stack After 3 Pops:");
        s.print();
    }
}