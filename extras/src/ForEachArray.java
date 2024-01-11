import java.util.Arrays;
import java.util.Scanner;

public class ForEachArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][];

        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                ints[j] = sc.nextInt();
            }
        }
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                System.out.println(ints[j]);
            }
        }
    }
}