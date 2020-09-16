public class CustomQueue<T> {
    private Node<T> headNode, tailNode;
    private int length;
    public CustomQueue(){
        headNode = null;
        tailNode = null;
        length = 0;
    }

    public void enqueue(T data) {
        Node<T> node = new Node<T>(data);
        if(headNode == null) {
            headNode = node;
        }
        else {
            tailNode.setNextNode(node);
        }
        tailNode = node;
        ++length;
    }

    public T dequeue() {
        try {
            T data = headNode.getData();
            headNode = headNode.getNextNode();
            --length;
            return data;
        }
        catch (NullPointerException exception) {
            return null;
        }
    }

    public T front() {
        try {
            return headNode.getData();
        }
        catch (NullPointerException exception) {
            return null;
        }
    }

    public int size() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }


}
