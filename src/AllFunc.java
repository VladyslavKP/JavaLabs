public class AllFunc {
    //1
    public static int[] ArithmeticProgression1(int N, int A, int D) {
        int[] progression = new int[N];
        for (int i = 0; i < N; i++) {
            progression[i] = A + i * D;
        }
        return progression;
    }
    //2
    public static int[] ArithmeticProgression2(int N, int A, int D) {
        int[] progression = new int[N];
        for (int i = 0; i < N; i++) {
            progression[i] = A + i * 2 * D;
        }
        return progression;
    }
    //3
     public static double calculateArea(double a, double b) {
        return a * b;
    }

    public static double calculatePerimeter(double a, double b) {
        return 2 * (a + b);
    }
    //4
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
    //5
     public static String getSeason(int month) {
        String season;
        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "л≥то";
                break;
            case 9:
            case 10:
            case 11:
                season = "ос≥нь";
                break;
            default:
                season = "нев≥домий м≥с€ць";
                break;
        }
        return season;
    }
}
