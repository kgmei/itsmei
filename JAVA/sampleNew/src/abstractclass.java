abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound(); 

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
    
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class abstractclass {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.makeSound();
        dog.sleep();
    }
}


