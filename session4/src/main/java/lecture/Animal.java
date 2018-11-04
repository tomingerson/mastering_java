package lecture;

/**
 * Static methods cannot be overriden, but redefined.
 *
 * @author Created by tom on 03.10.2018.
 */
class Animal {
    static void doStuff() {
        System.out.println("a ");
    }
}

class Dog extends Animal {
    static void doStuff() {
        System.out.println("d ");
    }

    public static void main(String[] args) {
        Animal[] a = {new Animal(), new Dog(), new Animal()};
        for (int i = 0; i < a.length; i++) {
            Animal.doStuff();
        }
    }
}
