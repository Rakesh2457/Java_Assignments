public class Part2 {
    public static void main(String[] args) {
        Cycle[] cycles = {new Cycle(), new UniCycle(), new Bicycle(), new Tricycle()};
        for (Cycle cycle : cycles) {
            cycle.balance();
//            cannot cast one class with another
            ((UniCycle) cycle).balance();
            cycle.printType();
        }
    }
}