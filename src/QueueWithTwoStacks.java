import java.util.Stack;

class QueueWithTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueWithTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // enqueue method to add an item to the back of the queue.
    public void enqueue(int item) {
        stack1.push(item);
    }

    // dequeue method to remove an item from the front of the queue.
    public Integer dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            return null;
        }
    }

    // peek method to return the top item from the front of the queue without removing it.
    public Integer peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            return stack2.peek();
        } else {
            return null;
        }
    }
}

