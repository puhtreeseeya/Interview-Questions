package OOP.Abstract;

class Dog extends Animal {
    void walk() {
        System.out.println("Animal is walking");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }

    void eat() {
        System.out.println("Animal is eating");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        a.walk();
        a.sleep();
        a.eat();
        a.breathe();
    }
}
