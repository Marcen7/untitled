public class Ex13LoopInLoop {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){
                System.out.print("Aktualna wartość licznika: " +1);

                for (int j = 0; j < 10; j++) {
                    System.out.println(">>>>Wartość  'j': " + j);
        }

        System.out.print("koniec programu");
    }
}
}