import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {


    public int getInt() {

        boolean repeat ;
        int x = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                x = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.out.println("Not a number, try again!");
            }
        } while (repeat);
        return x;
    }


    public float getFloat() {

        boolean repeat ;
        float x = 0;
        do {
            try {
                Scanner scan = new Scanner(System.in);
                x = scan.nextFloat();
                repeat = false;
            } catch (InputMismatchException error) {
                repeat = true;
                System.out.println("Not a number, try again!");
            }
        } while (repeat);
        return x;
    }


}
