public class SingleListIterator<E>{
    private Node<E> currentNode;
    private int size = 0;

    SingleListIterator(Node<E> head){
        this.currentNode = head;
    }
    public Node<E> next(){
        currentNode = currentNode.next;
        return currentNode;
    }
    public boolean hasNext(){
        return currentNode.next != null;
    }

    public void add(E elementData){
        Node<E> newNode = new Node<E>(elementData);
        currentNode.next = newNode;
        currentNode = currentNode.next;
        size++;
    }
    public void remove(){
        while (currentNode.next.next != null){
            currentNode = currentNode.next;
        }

        currentNode.next = null;
        size--;
    }
    public int size(){
        return size;
    }
}