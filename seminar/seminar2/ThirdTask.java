package seminar.seminar2;

import java.util.Scanner;

public class ThirdTask {
    static String my_text;

    ThirdTask(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your text: ");
        my_text = in.next();
        in.close();
    }

    public static String reverse() {
        String reversString = "";
        for (int i = my_text.length() - 1; i >= 0; i--) {
            reversString += my_text.charAt(i);
        }
        return reversString;
    }

    public static boolean isPalindrome() {
        if(my_text.equals(reverse())){
            return true;
        }
        else{
            return false;
        }
    }

    public static void getResult(){
        if(isPalindrome() == true){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("No Palindrome");
        }
    }
}
