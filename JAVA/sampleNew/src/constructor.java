import java.util.Scanner;
public class constructor {
    public int num;
    public constructor(int value){
        num = value;  
    }
    public int getnum(){
        return num;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int value = sc.nextInt();
        sc.close();
        constructor obj = new constructor(value);
       int num = obj.getnum();
        System.out.println("My num value is: " + num);
    }
}
