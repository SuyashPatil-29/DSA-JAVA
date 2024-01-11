import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr.add(sc.nextInt());
        }

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        System.out.println(arr);
    }
}
