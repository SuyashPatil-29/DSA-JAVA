import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an input");
        String input = sc.nextLine();
        System.out.println("Enter a target element");
        char target = sc.next().charAt(0);

        System.out.println(search(input,target));
    }

    static boolean search(String input, char target){
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)== target){
                return true;
            }
        }
        return false;
    }
}
