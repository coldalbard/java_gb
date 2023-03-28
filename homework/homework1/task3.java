package homework.homework1;
import java.util.Scanner;


// 3. Реализовать простой калькулятор
public class task3 {
    // task3
    public static int Operations(char o, int number1, int number2)
    {
        int sum = 0;
        if(o == '1' || o == '+')
        {
            sum = number1 + number2;
            return sum;
        }
        else if(o == '2' || o == '-')
        {
            sum = number1 - number2;
            return sum;
        }
        else if(o == '3' || o == '*')
        {
            sum = number1 * number2;
            return sum;
        }
        else if(o == '4' || o == '/')
        {
            sum = number1 / number2;
            return sum;
        }
        else return 922337209;
    }

    public static void PrintResult(int result, char o, int number1, int number2)
    {
            if(result == 922337209)
        {
            System.out.print("Error, check if you have written the numbers or operations correctly");
        }
        else
        {
            System.out.printf("%s %s %s = %s\n", number1, o, number2, result);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter the operation I remind you that: \n1. Addition is (+) \n2. Subtraction is (-) \n3. Multiplication is (*) \n4. Division is (/) \nEnter the operation: ");
        String oper = in.nextLine();
        char o = oper.charAt(0);
        System.out.print("Please enter the first number: ");        
        int number1 = in.nextInt();
        System.out.print("Please enter the second number: ");
        int number2 = in.nextInt();
        in.close();   
        int result = Operations(o, number1, number2);
        PrintResult(result, o, number1, number2);
    }
}
