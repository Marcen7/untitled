public class Ex1_1000 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 1000; i++){

            if(i % 3 ==0){
                sum +=i;
            }
        }
        System.out.print(sum);
        System.out.print("Suma jest równa ");
    }
}
