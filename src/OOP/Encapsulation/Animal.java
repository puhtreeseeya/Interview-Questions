package OOP.Encapsulation;

public class Animal {
    private String name;
    private int age;
    private int height;

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public int getHeight() {
        return this.height;
    }
    public void setName(String name) {
        if(name.isEmpty() || name == null) {
            System.out.println("Please enter a VALID name");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("Please enter a VALID age");
        } else {
            this.age = age;
        }
    }

    public void setHeight(int height) {
        if(height < 0) {
            System.out.println("Please enter a VALID height");
        } else {
            this.height = height;
        }
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.height);
    }


    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.setAge(12);
        animal.setName("Bobby");
        animal.setHeight(122);
        animal.printInfo();
    }
}
