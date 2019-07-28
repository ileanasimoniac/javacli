public class LogicalOp {


    public int getHigherNumber(int a, int b) {
        if (a > b) {
            return a; // daca a este mai mare il returneaza si iese din metoda
        } else {
            return b;  // daca b este mai mare il returneaza si iese din metoda
        }
        // daca nu avem else, atunci va da eroarea: Missing return statement.
    }

    // aici vor fi operatiile logice

    public void printToHundred(int number) {
        for (int i = number; i <= 100; i++) { // folosim for cand stim de cate
//                                              ori vrem sa iteram.
            System.out.println(i);
        }
    }

    public void printToHundredWhile(int number){
        while (number <= 100){
            System.out.println(number);
            number++;
        }
    }

    public void printToHundredDoWhile(int number){
        do { // se executa cel putin o data, spre deosebire de while-do.
            System.out.println(number);
            number++;
        }while (number<=100);
    }

    public void printSumAndAverage(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("Average is : " + (sum/100f));
    }

    public void printSumAndAverageWhile(){
        int sum =0;
        int x = 1;
        while (x <= 100){
            sum += x;
            x++;
        }
        System.out.println("suma:"+ sum);
        System.out.println("Average is : " + (sum/100f));
    }

    public int[] getArrayToHundred(){
        int[] myArray = new int[100];

        for (int i = 1; i <= 100; i++){
            myArray[i-1] = i;
        }
        return myArray;
    }

    public float getAverageArray(int[] myArray){
        float sum = 0;
        for (int i = 0; i < myArray.length; i++){
            sum += myArray[i];
        }
        return (sum/myArray.length);
    }
}
