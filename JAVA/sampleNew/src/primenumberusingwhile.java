import java.util.Scanner;
public class primenumberusingwhile {
    public void primecalculation(){
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Prime numbers from 1 to " + number + ":");
        int i = 2;
        while (i <= number) {
            boolean isPrime = true;
            int j = 2;
            while (j <= i/2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }

            if (isPrime) {
                System.out.println(i);
            }
            i++;
        }
    }
    public static void main(String[] args) {
        primenumberusingwhile objnew = new primenumberusingwhile();
        objnew.primecalculation();
    }
}