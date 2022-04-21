public class Node<E>{
    E data;
    Node<E> next;

    Node(E elementData){
        this.data = elementData;
        this.next = null;
    }
    public String toString(){
        if(data == null)
            return "Null";
        return data.toString();
    }
}