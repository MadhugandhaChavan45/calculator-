import java.util.*;
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Calculator");
        int flag=0;
        int operator;
        double number,power;
        while(flag==0)
        {
            System.out.println("Give Operation of Choice\n");
            System.out.println("1. Square root function");
            /*System.out.println("2. Factorial Function");
            System.out.println("3. Natural logarithm");
            System.out.println("4. Power Function");*/
            System.out.println("2. Exit\n");
            operator=sc.nextInt();
            switch(operator)
            {
                case 1:
                    System.out.println("Enter Number");
                    number=sc.nextDouble();
                    double ans = Math.sqrt(number);
                    System.out.println("Square root of "+number+" is "+ans+"\n");
                    break;
                /*case 2:
                    System.out.println("Enter Number");
                    number=sc.nextDouble();
                    int fact=1;
                    for(int i=1;i<=number;i++)
                    {
                        fact=fact*i;
                    }
                    System.out.println("factorial of "+number+" is "+fact+"\n");
                    break;
                case 3:
                    System.out.println("Enter Number");
                    number=sc.nextDouble();
                    ans = Math.log(number);
                    System.out.println("Natural Logarithm of "+number+" is "+ans+"\n");
                    break;
                case 4:
                    System.out.println("Enter Number");
                    number=sc.nextDouble();
                    System.out.println("Enter Power");
                    power=sc.nextDouble();
                    ans = Math.pow(number,power);
                    System.out.println(+number+" raised to "+power+" is " +ans+"\n");
                    break;*/
                default:
                    System.out.println("Invalid Input\n");
                    flag=1;
            }
        }
    }
}