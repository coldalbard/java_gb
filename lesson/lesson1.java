import java.util.Scanner;
public class lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }
}