public class Run {
    private Read read = new Read();
    private Calculator calc = new Calculator();


    private void printMenu() {
        System.out.println("Hello!\n" +
                "Please select a value from the menu:\n" +
                "1. Sum\n" +
                "2. Difference\n" +
                "3. Multiply\n" +
                "4. Divide");
    }

    private boolean selectItemFromMenu() {
        System.out.print("Please select menu number: ");
        int numberFromUser = read.getInt();
        switch (numberFromUser) {
            case 1:
                sum();
                return true;
            case 2:
                dif();
                return true;
            case 3:
                multiply();
                return true;
            case 4:
                divide();
                return true;
            case 0:
                System.out.println("Bye!");
                return false;
            default:

                System.out.println("Try again!");
                return true;
        }
    }

    public void runProgram() {
        do {
            printMenu();

        } while (selectItemFromMenu());
    }


    private void sum() {
        System.out.print("Please enter the first number: ");
        int first = read.getInt();
        System.out.print("Please enter the second number: ");
        int second = read.getInt();
        System.out.println("The sum is: " +
                calc.sum(first, second));
    }

    private void dif() {
        System.out.print("Please enter the first number: ");
        int first = read.getInt();
        System.out.print("Please enter the second number: ");
        int second = read.getInt();
        System.out.println("The diff is: " +
                calc.diff(first, second));
    }

    private void multiply() {
        System.out.print("Please enter the first number: ");
        float first = read.getFloat();
        System.out.print("Please enter the second number: ");
        float second = read.getFloat();
        System.out.println("Multiply result is: " +
                calc.multiply(first, second));
    }

    private void divide() {
        System.out.print("Please enter the first number: ");
        float first = read.getFloat();
        System.out.print("Please enter the second number: ");
        float second = read.getFloat();
        System.out.println("Division result is: " +
                calc.divide(first, second));
    }
}
