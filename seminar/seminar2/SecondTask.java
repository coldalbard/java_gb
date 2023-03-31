package seminar.seminar2;
import java.util.Scanner;
// aaabbbcccdd -> abcd

public class SecondTask {
    static String string;
    static boolean repited;

    SecondTask(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter your text: ");
        string = in.next();
        in.close();
    }

    public static StringBuilder getUniqSequence() {
        StringBuilder res = new StringBuilder();
        char[] chars = string.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            repited = false;
            for (int j = i + 1; j < chars.length; j++) {
                if(chars[i] == chars[j]){
                    repited = true;
                    break;
                }
            }
            if(!repited){
                res.append(chars[i]);
            }
        }
        return res;
    }
}
