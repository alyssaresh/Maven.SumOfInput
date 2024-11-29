/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer in Jan 2024
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Main main = new Main();
        //do I need to declare new object main? 
        int num = main.getInputNumber();
        int sum = main.sumOfNumbers(num);
        int gaussSum = main.gaussianSumOfNumbers(num);
        System.out.println(sum);
        System.out.println(gaussSum);
    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    int sumOfNumbers(int n) {
        int sum = 0;
        int i = 0;
        while (i <= n) {
            sum = sum + i;
            ++i;
        }
        return sum;
    }

    
    int getInputNumber() { // gee, may thi sis useful in another lab?
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;

    }



    // for Extra Credit
    int gaussianSumOfNumbers(int n) {
        return (n * (n + 1)) / 2;
    }


    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}
