
import java.util.Scanner;

public class CountEven {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Enter the number of elements : ");
            int n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("enter the elements : ");
            for (int x = 0; x < n; x++) {
                arr[x] = sc.nextInt();
            }
            System.out.println("the even numbers are : ");
            int count = 0;
            for (int x = 0; x < n; x++) {
                if (arr[x] % 2 == 0) {
                    count++;
                    System.out.println(arr[x]);
                }
            }
            System.out.println(count);
        }
    }
}
