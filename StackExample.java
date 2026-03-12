import java.util.Stack;

public class StackExample {

    Stack<Integer> stack = new Stack<>();

    void pushElement(int value) {
        stack.push(value);
        System.out.println(value + " pushed");
    }

    void popElement() {
        if (!stack.isEmpty()) {
            System.out.println(stack.pop() + " popped");
        } else {
            System.out.println("Stack is empty");
        }
    }

    void checkEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    public static void main(String[] args) {

        StackExample s = new StackExample();

        s.pushElement(10);
        s.pushElement(20);

        s.popElement();

        s.checkEmpty();
    }
}
