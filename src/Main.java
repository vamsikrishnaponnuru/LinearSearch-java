import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {4, 86, 45, 2, 33, 49, 77, 1, 22, 3, 63, 5};
        int num = s.nextInt();
        search(arr, num);
    }

    static void search(int[] arr, int num1) {
        for (int i = 0; i < arr.length; i++) {
            if (num1 == arr[i]) {
                System.out.printf("%d is present at index %d", num1, i);
                return;
            }
        }
        System.out.println("Not present !");
    }
}