import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator");
        int flag = 0;
        int operator;
        double number, power;
        while (flag == 0) {
            System.out.println("Give Operation of Choice:\n");
            System.out.println("1. Square root operation");
            /*System.out.println("2. Factorial Function");
            System.out.println("3. Natural logarithm");
            System.out.println("4. Power Function");*/
            System.out.println("2. Exit\n");
            operator = sc.nextInt();
            switch (operator) {
                case 1:
                    System.out.println("Enter Number");
                    number = sc.nextDouble();
                    squareRoot(number);
                    break;
                /*case 2:
                    System.out.println("Enter Number");
                    number=sc.nextDouble();

                    break;
                case 3:
                    System.out.println("Enter Number");
                    number=sc.nextDouble();
                    break;
                case 4:
                    System.out.println("Enter Number");
                    number=sc.nextDouble();
                    System.out.println("Enter Power");
                    power=sc.nextDouble();
                    break;*/
                case 2:
                    System.out.println("Existing");
                    flag=1;
                    break;
                default:
                    System.out.println("Invalid Input\n");
                    flag = 1;
            }
        }
    }

    public static double squareRoot(double number) {
        double ans = Math.sqrt(number);
        System.out.println("Square root of " + number + " is " + ans + "\n");
        logger.info("\nExecuting squareRoot function!");
        return ans;
    }

//    public static int factorial(int number){
//        int fact=1;
//        for(int i=1;i<=number;i++)
//        {
//            fact=fact*i;
//        }
//        System.out.println("factorial of "+number+" is "+fact+"\n");
//        logger.info("\nExecuting factorial function!");
//        return fact;
//    }
//    public static double naturalLog(double number){
//        double ans = Math.log(number);
//        System.out.println("Natural Logarithm of "+number+" is "+ans+"\n");
//        logger.info("\nExecuting log function!");
//        return ans;
//    }
//    public static double power(double number, double power){
//        double ans = Math.pow(number,power);
//        System.out.println(+number+" raised to "+power+" is " +ans+"\n");
//          logger.info("\nExecuting power function!");
//        return ans;
//    }
}