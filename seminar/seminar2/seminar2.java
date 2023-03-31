package seminar.seminar2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Scanner;
 
public class seminar2{
    public static void main(String[] args) {
        // // task1
        // seminar2_firstTask firstTask = new seminar2_firstTask();
        // seminar2_firstTask.getResult();
        // // task2
        // SecondTask secondTask = new SecondTask();
        // System.out.println(secondTask.getUniqSequence());
        // // task3
        // ThirdTask thirdTask = new ThirdTask();
        // thirdTask.getResult();
        // // task4
        FourthTask fourthTask = new FourthTask();
        try {
            fourthTask.writer();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}