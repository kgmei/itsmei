import java.util.Scanner;
public class callinsidethefunction {
   String name;
    public void getname(){
         try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the name : ");
            name = sc.nextLine();
        }   
        display();
    }
    public void display() {
        System.out.println( "the name is" + name);
    }
    public static void main(String[] args){
        callinsidethefunction obj = new callinsidethefunction();
        obj.getname();
    }
}

