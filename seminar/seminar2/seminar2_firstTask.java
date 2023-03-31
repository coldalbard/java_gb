package seminar.seminar2;

import java.util.Scanner;

public class seminar2_firstTask {
    static int n;
    static char c1;
    static char c2;
    static int count = 0;

    seminar2_firstTask(){
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter N: ");
        n = in.nextInt();
        System.out.print("enter c1: ");
        c1 = in.next().charAt(0);
        System.out.print("enter c2: ");
        c2 = in.next().charAt(0);
        in.close();
    }

    public static boolean isOdd(int n){
        if(n % 2 == 0 && n > 0){
            return true;
        }
        else{
            System.out.println("error");
            return false;
        }
    }

    public static void getResult(){
        if(isOdd(n)) {
            StringBuilder res = new StringBuilder();
            while (n != count) {
                res.append(c1).append(c2);
                count += 2;
            }
            System.out.println(res);
        }
    }
}
