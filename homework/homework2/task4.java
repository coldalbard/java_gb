package homework.homework2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class task4 {
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
        String res;
        StringBuilder appres = new StringBuilder();
        int count = 0;
        try(FileReader reader = new FileReader("homework\\homework2\\task4_log.txt"))
        {
           // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                count++;
                appres.append(Character.toString(c));
            }
            appres.toString();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }

        if(result == 922337209)
        {
            res = "Error, check if you have written the numbers or operations correctly";
            System.out.println(res);
        }
        else
        {
            res = (number1 + " " + o  + " " + number2 + " = " + result);
            System.out.println(res);
        }
        try {
            if(count > 1){
                FileWriter fw = new FileWriter("homework\\homework2\\task4_log.txt", false);
                fw.write(appres + "\n" + res.toString());
                fw.close();
            }
            else {
                FileWriter fw = new FileWriter("homework\\homework2\\task4_log.txt", false);
                fw.write(res.toString());
                fw.close();
            }
        } catch (Exception e) {
                System.out.println("ERROR!");
        }
    }
}
