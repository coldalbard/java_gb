package homework.homework1;
import java.util.Scanner;
// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! 
// (произведение чисел от 1 до n)


public class task1 {
    // task1
    public static int SumNumbers(int n){
        int sumNum = 0;
        for(int i = 1; i < n; i++){
            sumNum += i;
        }
        return sumNum;
    }

    public static int ProductNumbers(int n){
        int prNum = 1;
        for(int i = 1; i < n; i++){
            prNum *= i;
        }
        return prNum;
    }
    public static void main(String[] args) {
        // task1
        Scanner in = new Scanner(System.in);        
        System.out.print("Введите число: ");        
        int n = in.nextInt(); 
        int numbersSum = SumNumbers(n);
        System.out.println("Сумма чисел(от 1 до n): " + numbersSum);
        int numbersProduct = ProductNumbers(n);
        System.out.println("Произведение чисел(от 1 до n): " + numbersProduct);
    }
}
