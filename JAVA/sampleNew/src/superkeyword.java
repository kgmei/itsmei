interface Printable {
    void print();
}

class Superclass {
    void display() {
        System.out.println("Displaying from Superclass");
    }
}

class MyClass extends Superclass implements Printable {
    @Override
    public void print() {
        super.display(); 
        System.out.println("Printing from MyClass");
    }
}

public class superkeyword {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.print();
    }
}
