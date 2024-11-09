import java.utiol.Scanner;

public class AverageAnArray {
    public static int average (int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
    public static double average(double[] array) [
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    ]
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten double values:");
        double [] doubleArray = new double[10];
        for (int i = 0; < doubleArray.length; i++) {
            doubleArray[i] = input.nextDouble();
        }
        double averageDouble = average(doubleArray);
        System.out.println("The average value is: ");

        input.close();
    }
}
//110824_TrejoKevin_exercise7.8