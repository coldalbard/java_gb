package homework.homework2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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


    private static int task3hw(){
        Scanner in = new Scanner(System.in);
        System.out.print("1. Viewing\n2. Recording\nSelect an action: ");
        int n = in.nextInt();
        return n;
    }
    static int selectUser = task3hw();


    public static String InputUser(){
        if(selectUser == 2)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a surname: ");
            String x1 = in.nextLine();
            
            System.out.print("Enter a rating: ");
            String x2 = in.nextLine();

            System.out.print("Enter a category: ");
            String x3 = in.nextLine();
            StringBuilder stt = new StringBuilder();
            String st;
            stt = new StringBuilder("{" + '"' + "surname" + '"' + ":" + '"' 
            + x1 + '"' + "," + '"' + "rating" + '"' + ":" + '"' + x2 + '"' 
            + "," + '"' + "category" + '"' + ":" + '"' + x3 + '"' + "}");
            st = stt.toString();
            return st;
        }
        else if(selectUser == 1){
            fileReturn();
            return "/n";
        }
        else{
            System.out.println("Check the correctness of the entered data\n");
            return InputUser();
        }
    }
    static String fileInput = InputUser();

    public static void fileAppend(){
        StringBuilder str = new StringBuilder();
        String res;
        try(FileReader reader = new FileReader("homework\\homework2\\task3Students.json"))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                if((char)c == ']' || (char)c == '['){
                    continue;
                }
                else{
                    str.append(Character.toString(c));
                }
            }
        }
        catch(IOException ex){
                
            System.out.println(ex.getMessage());
        }
        if(lenghtfile > 1){
            res = "[" + str + ",\n" + fileInput  + "]";
        }
        else{
            res = "[" + fileInput + "]";
        }
        if(fileInput == "/n"){
            res = "[" + str + "]";
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
        StringBuilder returnFile = new StringBuilder();
        try(FileReader reader = new FileReader("homework\\homework2\\task3Students.json"))
        {
           // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                if((char)c == ',') returnFile.append(Character.toString(':'));
                if((char)c == '[' || (char)c == ']' || (char)c == '{' || (char)c == '}' || (char)c == '"' || (char)c == ','){
                    continue;
                }
                else returnFile.append(Character.toString(c));
            }
            String st = returnFile.toString();
            String[] ff = st.split(":");
            String[] result_return = new String [ff.length];
            int count1 = 0;
            int count2 = 1;
            for (String string : ff) {
                if(count1 == count2){
                    result_return[count2] = string;
                    count2 += 2;
                }
                count1++;
            }
            
            int newCount = 0;
            int firstword = 0;
            int secondword = 2;
            int thirdword = 4;
            for (String string : result_return) {
                if(newCount == firstword || firstword + 6 == newCount) {
                    string = "\nСтудент ";
                    firstword += 6;
                }
                if(newCount == secondword || secondword + 6 == newCount){
                    string = " получил ";
                    secondword += 6;
                }
                if(newCount == thirdword || thirdword + 6 == newCount){
                    string = " по предмету ";
                    thirdword += 6;
                }
                newCount++;
                System.out.print(string);
            }
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }
    }
}
