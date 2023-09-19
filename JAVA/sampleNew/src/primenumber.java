import java.util.Scanner;

public class primenumber {
    public void primecalculation(){
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Prime numbers from 1 to " + number + ":");
        for (int i = 1; i <= number; i++) {
            boolean isPrime = true;
        for (int num = 2; num <= i/2; num++) {
                if (i % num == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        } 
    }
    public static void main(String[] args) {
        primenumber objnew = new  primenumber();
        objnew.primecalculation();
    }
}
