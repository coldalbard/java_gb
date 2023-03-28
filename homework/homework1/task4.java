package homework.homework1;
import java.util.Scanner;
// * +Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, 
// например, 2? + ?5 = 69. Требуется восстановить выражение 
// до верного равенства. Предложить хотя бы одно решение или сообщить, 
// что его нет.

public class task4 {
    public static String[] Number(String number1, String o, String number2, String number3){

        int index1 = number1.indexOf("?");
        int index2 = number2.indexOf("?");
        int index3 = number3.indexOf("?");
        String new_number1 = number1;
        String new_number2 = number2;
        String new_number3 = number3;
        String[] res_numbers = new String [4];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if(index1 >= 0){
                        new_number1 = new_number1.substring(0, index1) + i + new_number1.substring(index1+1);
                        System.out.print(new_number1);
                    }
                    else new_number1 = number1;

                    if(index2 >= 0){
                        new_number2 = new_number2.substring(0, index2) + j + new_number2.substring(index2+1);
                        System.out.print(new_number2);
                    }
                    else new_number2 = number2;
                    if(index2 >= 0){
                        new_number3 = new_number3.substring(0, index3) + k + new_number3.substring(index3+1);
                        System.out.print(new_number3);
                    }
                    else new_number3 = number3;
                    if(Integer.parseInt(new_number1.trim()) + Integer.parseInt(new_number2.trim()) == Integer.parseInt(new_number3.trim())){
                        res_numbers[0] = new_number1;
                        res_numbers[1] = o;
                        res_numbers[2] = new_number2;
                        res_numbers[3] = new_number3;
                        return res_numbers;
                    }
                }
            }
        }
        return res_numbers;
    }
    public static void ShowArray(String[] arr){
        System.out.print('[');
        for(int i = 0; i < arr.length; i++){
            if(i == arr.length - 1){
                System.out.print(arr[i]);
            }
            else{
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print(']');
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter: ");
        String number1 = in.nextLine();
        System.out.print("Please enter the operation I remind you that: \n1. Addition is (+) \n2. Subtraction is (-) \n3. Multiplication is (*) \n4. Division is (/) \nEnter the operation: ");
        String oper = in.nextLine();
        System.out.print("Please enter: ");
        String number2 = in.nextLine(); 
        System.out.print("Please enter: ");
        String number3 = in.nextLine();
        in.close();
        String[] res = Number(number1, number2, oper, number3);
        ShowArray(res);
    }
}
