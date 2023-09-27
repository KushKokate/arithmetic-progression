import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int queries = scanner.nextInt();

        for (int i = 0; i < queries; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();

            printSeries(a, b, n);
        }

        scanner.close();
    }

    public static void printSeries(int a, int b, int n) {
        int term = a;
        for (int i = 0; i < n; i++) {
            term += Math.pow(2, i) * b;
            System.out.print(term + " ");
        }
        System.out.println();
    }
}
