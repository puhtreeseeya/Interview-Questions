package OOP.Interface;

class Bird extends Animal implements BirdInterface {
    public void fly() {
        System.out.println("All animals can walk but some animals can fly");
    }
}
