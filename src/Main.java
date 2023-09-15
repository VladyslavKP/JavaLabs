public class Main {
    public static void main(String[] args) {

        int[] progression1 = AllFunc.ArithmeticProgression1(5, 2, 3);
        int[] progression2 = AllFunc.ArithmeticProgression2(6, 4, 2);

        System.out.println("������ �����:");
        printArray(progression1);
        System.out.println("������ �����:");
        printArray(progression2);

        System.out.println("///////////////////:");

        double area = AllFunc.calculateArea(5, 5);
        double perimeter = AllFunc.calculatePerimeter(3, 6);

        System.out.println("����� ������������: " + area);
        System.out.println("�������� ������������: " + perimeter);

        System.out.println("///////////////////:");
        int A = 3;
        boolean isEven = AllFunc.isEvenNumber(A);
        if (isEven) {
            System.out.println(A + " � ������ ������.");
        } else {
            System.out.println(A + " �� � ������ ������.");
        }
    }


    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
