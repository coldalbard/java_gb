package homework.homework1;
// 2. Вывести все простые числа от 1 до 1000

public class task2 {
    // task2
    public static int SizeAray() {
        int count = 0;
        int checkprime = 0;
        for (int i = 2; i < 1000 + 1; i++) {
            checkprime = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    checkprime += 1;
                }
            }
            if (checkprime == 0) {
                count++;
            }
        }
        return count;
    }

    public static int[] PrimeNumbers(int size) {
        int[] array = new int[size];
        int count = 0;
        int checkprime = 0;
        for (int i = 2; i < 1000 + 1; i++) {
            checkprime = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    checkprime += 1;
                }
            }
            if (checkprime == 0) {
                array[count] = i;
                count++;
            }
        }
        return array;
    }

    public static void ShowArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + ", ");
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        // task2
        int size = SizeAray();
        int[] numbersPrime = PrimeNumbers(size);
        ShowArray(numbersPrime);
    }
}
