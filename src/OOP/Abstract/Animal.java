package OOP.Abstract;


abstract class Animal {
    abstract void walk();
    abstract void sleep();
    abstract void eat();
    void breathe() {
        System.out.println("currently breathing");
    }
}
