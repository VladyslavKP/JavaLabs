public class Main {
    public static void main(String[] args) {

        int[] progression1 = AllFunc.ArithmeticProgression1(5, 2, 3);
        int[] progression2 = AllFunc.ArithmeticProgression2(6, 4, 2);

        System.out.println("Перший метод:");
        printArray(progression1);
        System.out.println("Другий метод:");
        printArray(progression2);

        System.out.println("///////////////////:");

        double area = AllFunc.calculateArea(5, 5);
        double perimeter = AllFunc.calculatePerimeter(3, 6);

        System.out.println("Площа прямокутника: " + area);
        System.out.println("Периметр прямокутника: " + perimeter);

        System.out.println("///////////////////:");
        int A = 3;
        boolean isEven = AllFunc.isEvenNumber(A);
        if (isEven) {
            System.out.println(A + " є парним числом.");
        } else {
            System.out.println(A + " не є парним числом.");
        }
    }


    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
