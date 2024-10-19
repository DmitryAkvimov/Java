import java.util.LinkedList;

class MyStack {
    private LinkedList<String> stack = new LinkedList<>();

    public void push(String element) {
        stack.addFirst(element);
    }

    public String pop() {
        return stack.removeFirst();
    }

    public String peek() {
        return stack.peekFirst();
    }

    public LinkedList<String> getElements() {
        return new LinkedList<>(stack);
    }
}

public class Printer {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        if (args.length == 0) {
            stack.push("apple");
            stack.push("banana");
            stack.push("pear");
            stack.push("grape");
        } else {
            for (String arg : args) {
                stack.push(arg);
            }
        }
        System.out.println(stack.getElements());
        System.out.println(stack.pop());
        System.out.println(stack.getElements());
        System.out.println(stack.peek());
    }
}
