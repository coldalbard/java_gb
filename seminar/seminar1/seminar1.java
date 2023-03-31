package seminar.seminar1;

import java.util.Scanner;
 
public class seminar1
{
    // Дан массив двоичных чисел, например 
    // [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);        
        System.out.print("Введите длину массива: ");        
        int x = s.nextInt();        
        int[] array = new int[x];        
        for(int i = 0; i < x; i++){
            System.out.print("Введите элемент "+i+": ");            
            array[i] = s.nextInt();        
        }
        
        System.out.print('[');
        for(int i = 0; i < x; i++){
            if(i == x - 1){
                System.out.print(array[i]);
            }
            else{
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print(']');
        
        int count = 0;
        int sum_digit = 0;
        for(int i = 0; i < x; i++){
            if(array[i] == 1){
                count = count + 1;
            }
            else{
                count = 0;
            }
            if(count > sum_digit){
                sum_digit = count;
            }
        }
        System.out.println(' ');
        System.out.println("максимальное количество подряд идущих 1 равно: " + sum_digit);
    }
}
