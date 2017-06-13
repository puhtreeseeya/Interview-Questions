package OOP.Interface;

public class Runner {

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.walk();

        System.out.println();
        Human human = new Human();
        human.talk();
        human.walk();
    }
}
