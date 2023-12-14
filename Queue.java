import java.util.*;

public class Queue {
    static class QueueY {
        static int arr[];
        static int size;
        static int rear;

        QueueY(int n) {
            arr = new int[size];
            this.size = n;

        }

        public static boolean isFull() {
            return rear == size - 1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // enqueue
        public static void add(int data) {
            if (isFull()) {
                System.out.println("full queue");
                return;
            }

            arr[++rear] = data;

        }

        // dequeue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty");
                return -1;
            }

            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty");
                return -1;
            }

            return arr[0];
        }
    }

    public static void main(String[] args) {
        QueueY q = new QueueY(5);

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.peek());
        System.out.println(q.remove());

    }
}
