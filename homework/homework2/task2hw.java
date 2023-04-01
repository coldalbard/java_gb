package homework.homework2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива, 
// результат после каждой итерации запишите в лог-файл.

public class task2hw {
    // Метод для чтения файла и записи его в перемнную
    public static StringBuilder returnFile(){
        StringBuilder returnstr = new StringBuilder();
        try(FileReader reader = new FileReader("homework\\homework2\\task2Array.txt"))
        {
           // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                returnstr.append(Character.toString(c));
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return returnstr;
    }
    static StringBuilder stringbldArray = returnFile(); 


    // Метод для перевода строки в целочисленный массив
    public static int[] CreateArray(){
        String string = stringbldArray.toString();
        String[] stringArray = string.split(", ");
        int[] intArray = new int [stringArray.length - 2];
        int count = 0;
        for (int i = 1; i < stringArray.length - 1; i++) {
            intArray[count] = Integer.parseInt (stringArray[i]);
            count++;
        }
        return intArray;
    }
    static int[] array = CreateArray();


    // Метод для логирования и для сортировки массива
    public static int[] SortArray() {
        StringBuilder logString = new StringBuilder();
        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
                logString.append(Arrays.toString(array)).append("\n");
                try {
                    FileWriter fw = new FileWriter("homework\\homework2\\task2_log.txt", false);
                    fw.write(logString.toString());
                    fw.close();
                } catch (Exception e) {
                    System.out.println("ERROR!");
                }
            }
        }
        return array;
    }
    static int[] sortNewArray = SortArray();


    // Метод для печати массива на экран
    public static void ShowArray() {
        System.out.print("[");
        for (int i = 0; i < sortNewArray.length; i++) {
            if(i == sortNewArray.length - 1) System.out.print(sortNewArray[i]);
            else System.out.print(sortNewArray[i] + ", ");
        }
        System.out.println("]");
    }
}
