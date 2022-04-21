public class Main {
    public static void main(String[] args) {
        SingleList<String> sList = new SingleList<>();

        SingleListIterator<String> addElementIterator = sList.iterator();
        addElementIterator.add("hello");
        addElementIterator.add("World");
        addElementIterator.add("New world");
        System.out.println(sList);

        SingleListIterator<String> removeElementIterator = sList.iterator();
        removeElementIterator.remove();
        System.out.println(sList);

    }
}