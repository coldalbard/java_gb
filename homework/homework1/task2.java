package homework.homework1;
// 2. Вывести все простые числа от 1 до 1000

public class task2 {
        // task2
        public static int SizeAray(){
            int count = 0;
            for(int i = 1; i < 1000; i++){
                if(i % 2 != 0 && i % 3 != 0){
                    count++;
                }
            }
            return count;
        }

        public static int[] PrimeNumbers(int size){
            int[] array = new int [size];
            int count = 0;
            for(int i = 0; i < 1000; i++){
                if(i % 2 != 0 && i % 3 != 0){
                    array[count] = i;
                    count++;
                }
            }
            return array;
        }
    
        public static void ShowArray(int[] array){
            System.out.print("[");
            for(int i = 0; i < array.length; i++){
                if(i == array.length - 1) System.out.print(array[i]);
                else System.out.print(array[i] + ", ");
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
