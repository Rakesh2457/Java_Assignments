public class Overloaded {
    Overloaded(){
        this("First Constructor");

    }
    Overloaded(String input){
        System.out.println("Second Constructor called from : "+input);
    }
}