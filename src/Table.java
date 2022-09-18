public class Table {
   public static void main(String[] args) {
        int n = 4;

       int[] numbers = new int[n];
       for (int i = 0; i < numbers.length; i ++) {
           numbers[i] = i * i;
       }
           for (int i = 0; i < numbers.length; i ++) {
               System.out.println(numbers[i]);
           }
       }

    }
