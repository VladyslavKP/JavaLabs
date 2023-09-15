public class Main {
    public static void main(String[] args) {

        int[] progression1 = AllFunc.ArithmeticProgression1(5, 2, 3);
        int[] progression2 = AllFunc.ArithmeticProgression2(6, 4, 2);

        System.out.println("Перший метод:");
        printArray(progression1);

        System.out.println("Другий метод:");
        printArray(progression2);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
