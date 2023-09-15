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
        System.out.println("///////////////////:");
        int monthNumber = 9;

        String season = AllFunc.getSeason(monthNumber);

        System.out.println("Час року для місяця номер " + monthNumber + ": " + season);
        System.out.println("///////////////////:");
        double num1 = 5.0;
        double num2 = 3.0;

        double sumOfSquares = AllFunc.calculateSumOfSquares(num1, num2);
        double differenceOfSquares = AllFunc.calculateDifferenceOfSquares(num1, num2);
        double productOfSquares = AllFunc.calculateProductOfSquares(num1, num2);
        double quotientOfSquares = AllFunc.calculateQuotientOfSquares(num1, num2);

        System.out.println("Сума квадратів: " + sumOfSquares);
        System.out.println("Різниця квадратів: " + differenceOfSquares);
        System.out.println("Добуток квадратів: " + productOfSquares);
        System.out.println("Частка квадратів: " + quotientOfSquares);
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
