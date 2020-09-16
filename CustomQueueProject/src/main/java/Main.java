
public class Main {
    public static void main(String[] args) {
        CustomQueue<String> customQueue = new CustomQueue<String>();
        customQueue.enqueue("AAA");
        customQueue.enqueue("BBB");
        System.out.println(customQueue.size());
        System.out.println(customQueue.dequeue());
        System.out.println(customQueue.size());
        System.out.println(customQueue.dequeue());
        System.out.println(customQueue.isEmpty());
        System.out.println(customQueue.dequeue());
        System.out.println(customQueue.size());
    }
}
