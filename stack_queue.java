import java.util.Scanner;

class Stack {
    int size;
    int top;
    int array[];

    Stack(int size) {
        this.size = size;
        top = -1;
        array = new int[size];
    }

    boolean push(int x) {
        if (top == size - 1) {
            System.out.println("Stack is Overflow");
            return false;
        } else {
            array[++top] = x;
            System.out.println("Element Pushed in Stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack is Underflow");
            return -1;
        } else {
            int x = array[top--];
            return x;
        }
    }

    void display() {
        if (top >= 0) {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Stack is empty.");
        }
    }
}

class Queue {
    int front, rear, size;
    int array[];

    Queue(int size) {
        this.size = size;
        front = rear = -1;
        array = new int[size];
    }

    boolean enqueue(int x) {
        if (rear == size - 1) {
            System.out.println("Queue is Overflow");
            return false;
        } else {
            if (front == -1) {
                front = 0;
            }
            array[++rear] = x;
            System.out.println("Element Enqueued in Queue");
            return true;
        }
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue is Underflow");
            return -1;
        } else {
            int x = array[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
            return x;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}

public class stack_queue {
    public static void main(String[] args) {
        System.out.println("Enter the Number for\n 1. Stack \n 2. Queue");
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                int stackSize;
                System.out.print("Enter the size of stack: ");
                stackSize = sc.nextInt();

                Stack stack = new Stack(stackSize);

                while (true) {
                    System.out.println("Enter option for stack : 1.Push\n 2.Pop\n 3.Display\n 4.Exit");
                    int option = sc.nextInt();

                    switch (option) {
                        case 1:
                            int element;
                            System.out.print("Enter the Element in Stack: ");
                            element = sc.nextInt();
                            stack.push(element);
                            break;

                        case 2:
                            int poppedElement = stack.pop();
                            if (poppedElement != -1) {
                                System.out.println("Popped Element: " + poppedElement);
                            }
                            break;

                        case 3:
                            stack.display();
                            break;

                        case 4:
                            System.out.println("Exiting program.");
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Invalid option. Please try again.");
                            break;
                    }
                }

            case 2:
                int queueSize;
                System.out.print("Enter the size of queue: ");
                queueSize = sc.nextInt();

                Queue queue = new Queue(queueSize);

                while (true) {
                    System.out.println("Enter option for queue : 1.Enqueue\n 2.Dequeue\n 3.Display\n 4.Exit");
                    int option = sc.nextInt();

                    switch (option) {
                        case 1:
                            int element;
                            System.out.print("Enter the Element in Queue: ");
                            element = sc.nextInt();
                            queue.enqueue(element);
                            break;

                        case 2:
                            int dequeuedElement = queue.dequeue();
                            if (dequeuedElement != -1) {
                                System.out.println("Dequeued Element: " + dequeuedElement);
                            }
                            break;

                        case 3:
                            queue.display();
                            break;

                        case 4:
                            System.out.println("Exiting program.");
                            System.exit(0);
                            break;

                        default:
                            System.out.println("Invalid option. Please try again.");
                            break;
                    }
                }
        }
    }
}
