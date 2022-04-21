public class SingleList<E>{
    private Node<E> head;

    SingleList(){
        head = new Node<>(null);
    }


    SingleListIterator<E> iterator(){
        return new SingleListIterator<E>(head);
    }

    public String toString(){
        if(head == null)
            return "List is Empty";
        SingleListIterator<E> iterator  = new SingleListIterator<E>(head);
        StringBuilder listStringBuilder = new StringBuilder("[ ");
        while (iterator.hasNext()){
            listStringBuilder.append(iterator.next()).append(", ");
        }
        return listStringBuilder.toString()+" ]";

    }
}