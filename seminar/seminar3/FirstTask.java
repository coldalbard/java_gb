package seminar.seminar3;

import java.util.ArrayList;
import java.util.Collections;

/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
*/

public class FirstTask {
    public void randomNumbersList(){
        ArrayList<Double> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(Math.random());
        }
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
