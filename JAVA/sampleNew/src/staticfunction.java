import java.util.Scanner;
public class staticfunction {

    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("enter the num1");
            int num1 = sc.nextInt();
            System.out.println("enter the num2");
            int num2 = sc.nextInt();
            sc.close();
        int result = multiply(num1, num2); 
        System.out.println("Multiplication result: " + result);

        double area =calculateCircleArea(2.5);
        System.out.println("Circle area: " + area);
    }
}


