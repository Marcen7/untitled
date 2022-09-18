public class NewLoop2 {
    public static void main(String[] args) {
        int n = 4;

        System.out.println("Podaj rozmiar tabeli");




        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i ++) {
            numbers[i] = i * i;
        }
        for (int i = 0; i < numbers.length; i ++) {
            System.out.println(numbers[i]);
        }
    }

}
