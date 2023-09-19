import java.util.ArrayList;
import java.util.Scanner;

public class insertdatas {
    public static void main(String[] args) {
        ArrayList<Object> myArrayList = new ArrayList<Object>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter some data (type 'done' to finish):");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                myArrayList.add(scanner.nextInt());
            } else if (scanner.hasNextDouble()) {
                myArrayList.add(scanner.nextDouble());
            } else if (scanner.hasNextBoolean()) {
                myArrayList.add(scanner.nextBoolean());
            } else {
                myArrayList.add(scanner.next());
            }
            if (scanner.hasNext("done")) {
                break;
            }
        }
        
        System.out.println(myArrayList);
    }
}
