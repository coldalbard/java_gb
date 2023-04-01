package homework.homework2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class task3hw {
    
    public static int checkLenhtFile() {
        int count = 0;
        try(FileReader reader = new FileReader("homework\\homework2\\task3Students.json"))
        {
           // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                count++;
            } 
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }
        return count;
    }
    static int lenghtfile = checkLenhtFile();


    private static String task3hw(){
        Scanner in = new Scanner(System.in);
        System.out.println("1. Viewing\n2. Recording\nSelect an action: ");
        int n = in.nextInt();
        if(n == 2)
        {
            System.out.println("Enter a surname: ");
            String x1 = in.nextLine();
            System.out.println("Enter a rating: ");
            String x2 = in.nextLine();
            System.out.println("Enter a category: ");
            String x3 = in.nextLine();
            StringBuilder stt = new StringBuilder();
            String st;
            stt = new StringBuilder("{" + '"' + "surname" + '"' + ":" + '"' 
            + x1 + '"' + "," + '"' + "rating" + '"' + ":" + '"' + x2 + '"' 
            + "," + '"' + "category" + '"' + ":" + '"' + x3 + '"' + "}");
            st = stt.toString();
            return st;
        }
        else if(n == 1){
            fileReturn();
            return "";
        }
        else{
            System.out.println("Check the correctness of the entered data\n");
            return task3hw();
        }
    }
    static String fileInput = task3hw();


    public static void fileAppend(){
        StringBuilder str = new StringBuilder();
        String res;
        try(FileReader reader = new FileReader("homework\\homework2\\task3Students.json"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                if((char)c != ']' || (char)c != '['){
                    str.append(Character.toString(c));
                }
            }
        }
        catch(IOException ex){
                
            System.out.println(ex.getMessage());
        }
        if(lenghtfile > 0){
            res = "[" + str + ",\n" + fileInput  + "]";
        }
        else{
            res = "[" + fileInput + "]";
        }

        try(FileWriter writer = new FileWriter("homework\\homework2\\task3Students.json", false))
        {
           // запись всей строки
            writer.write(res);
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    }


    public static void fileReturn(){
        try(FileReader reader = new FileReader("homework\\homework2\\task3Students.json"))
        {
           // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            } 
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }
    }
}
