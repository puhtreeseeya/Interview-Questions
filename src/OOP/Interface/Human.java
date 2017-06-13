package OOP.Interface;

class Human implements HumanInterface, AnimalInterface {
    public void talk() {
        System.out.println("Humans can speak");
    }

    public void walk() {
        System.out.println("Humans can walk");
    }
}
