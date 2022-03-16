package accept;
import java.util.Scanner;
public class Acceptcommand {





    public static void main(String[] args) {

        int count;
        int num1 , num2 ;
        System.out.println("How may numbers you want in the sequence:");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        System.out.println("Enter the two number u want ");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
       // scanner.close();
        System.out.print("Fibonacci Series of "+count+" numbers:");

        int i=1;
        while(i<=count)
        {
            System.out.print(num1+" ");
            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }
    }
}