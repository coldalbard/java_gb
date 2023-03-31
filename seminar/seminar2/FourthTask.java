package seminar.seminar2;
// Напишите метод, который составит строку, состоящую из 100
// повторений слова TEST и метод, который запишет 
// эту строку в простой текстовый файл, обрабатывайте исключения

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FourthTask {
    
    public static StringBuilder generateString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            stringBuilder.append("TEST ");
        }
        return stringBuilder;
    }

    public static void writer() throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\Новая папка\\java_gb\\seminar\\seminar2\\fourthTask.txt");
        
        fos.write(generateString().toString().getBytes());

        fos.close();
    }
}
