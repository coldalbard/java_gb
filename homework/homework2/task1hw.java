package homework.homework2;
import java.util.Scanner;
import java.io.*;
// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Параметры для фильтрации: 
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

public class task1hw {

    private static String task1hw(){
        Scanner in = new Scanner(System.in);
        System.out.print("Write your name, country, city or age: ");
        String where = in.nextLine();
        return where;
    }
    static String where = task1hw();

    public static StringBuilder returnFile(){
        StringBuilder returnfile = new StringBuilder();
        try(FileReader reader = new FileReader("homework\\homework2\\task1Json.json"))
        {
           // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                if ((char)c == ' ' || (char)c == '[' || (char)c == ']' || (char)c == '{') {
                    continue;
                }
                else{
                    // заполняем наш StringBuilder данные из файла в переменную retrurn file
                    returnfile.append(Character.toString(c));
                }
            }
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        }
        return returnfile;
    }

    public static void returnWhere(){
        StringBuilder returnfile = returnFile();
        // переводим наши данные из returnfile в тип string
        String sf = returnfile.toString();
        String[] nfsa = sf.split("},");
        System.out.println("select * from students where: x == " + where);
        int count = 0;
        for (String string : nfsa) {
            boolean hasCheese = string.contains(where);
            boolean hasCheese2 = string.contains("null");
            if(hasCheese == true && hasCheese2 == false){
                count++;
                System.out.println(string);
            }
        }
        if(count == 0){
            System.out.println("Error, please check the correctness of the entered data");
        }
    }
}
