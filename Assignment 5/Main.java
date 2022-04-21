package rakesh.assignment;

import rakesh.assignment.Data;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.printGlobalUnInitialized();
        data.printLocalUnInitialized();

        Singleton singleton = Singleton.initialize("Initial String");
        singleton.printString();
    }
}