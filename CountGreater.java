
import java.util.Scanner;

public class CountGreater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int m = sc.nextInt();

        System.out.println("Enter the number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < m) {
                count++;
            }
            System.out.println(count);
        }

    }

}
