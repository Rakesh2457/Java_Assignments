public class Rodent {
    Rodent() {
        System.out.println("Rodent class Constructor");
    }

    public void printMessage() {
        System.out.println("This is Rodent class");
    }
}

class Mouse extends Rodent {
    Mouse() {
        System.out.println("Mouse class Initialized");
    }

    public void printMessage() {
        System.out.println("This is Mouse Class");
    }
}

class Gerbil extends Rodent {
    Gerbil() {
        System.out.println("Gerbil class Initialized");
    }

    public void printMessage() {
        System.out.println("This is Mouse Class");
    }
}

class Hamster extends Rodent {
    Hamster() {
        System.out.println("Hamster class Initialized");
    }

    public void printMessage() {
        System.out.println("This is Hamster Class");
    }
}