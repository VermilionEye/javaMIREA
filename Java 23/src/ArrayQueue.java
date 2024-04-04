import java.util.Arrays;

// Интерфейс абстрактного типа данных для очереди
interface ArrayQueueADT<T> {
    void enqueue(T item);
    T element();
    T dequeue();
    int size();
    boolean isEmpty();
    void clear();
}

// Класс, реализующий циклическую очередь на массиве
public class ArrayQueue<T> implements ArrayQueueADT<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] data;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue() {
        this.data = new Object[DEFAULT_CAPACITY];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Добавить элемент в очередь
    @Override
    public void enqueue(T item) {
        if (size == data.length) {
            ensureCapacity();
        }
        rear = (rear + 1) % data.length;
        data[rear] = item;
        size++;
    }

    // Получить первый элемент очереди
    @Override
    public T element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) data[front];
    }

    // Удалить и вернуть первый элемент очереди
    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T item = (T) data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return item;
    }

    // Получить текущий размер очереди
    @Override
    public int size() {
        return size;
    }

    // Проверить, является ли очередь пустой
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Очистить очередь
    @Override
    public void clear() {
        Arrays.fill(data, null);
        front = 0;
        rear = -1;
        size = 0;
    }

    // Увеличить размер массива при необходимости
    private void ensureCapacity() {
        int newCapacity = data.length * 2;
        data = Arrays.copyOf(data, newCapacity);
        if (front > rear) {
            // Сдвигаем элементы в начало массива
            System.arraycopy(data, 0, data, data.length / 2, rear + 1);
            rear += data.length / 2;
        }
    }

    // Тесты
    public static void main(String[] args) {
        ArrayQueueADT<Integer> queue1 = new ArrayQueue<>();
        testQueue(queue1);

        ArrayQueueADT<String> queue2 = new ArrayQueue<>();
        testQueue(queue2);
    }

    private static <T> void testQueue(ArrayQueueADT<T> queue) {
        queue.enqueue((T) Integer.valueOf(1));
        queue.enqueue((T) Integer.valueOf(2));
        queue.enqueue((T) Integer.valueOf(3));

        System.out.println("Size: " + queue.size());
        System.out.println("Element: " + queue.element());

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Size: " + queue.size());

        queue.clear();
        System.out.println("Cleared. Size: " + queue.size());
    }
}
