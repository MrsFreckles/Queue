import java.util.ArrayList;

public class Queue<T> {

    private ArrayList<T> queue;

    public Queue() {
        this.queue = new ArrayList<>();
    }

    public void enqueue(T t) {
        queue.add(t);
    }

    public T dequeue() {
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public T front() {
        return queue.getFirst();
    }
}
