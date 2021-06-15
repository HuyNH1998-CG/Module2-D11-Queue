public class Client {
    public static void main(String[] args) {
        MyLinkedListQueue queue = new MyLinkedListQueue();
        queue.enqueue(5);
        queue.enqueue(15);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(12);
        queue.enqueue(30);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().key);
    }
}
