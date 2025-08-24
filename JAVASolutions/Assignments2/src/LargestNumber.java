import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the Largest Number:");
        System.out.println("First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Second Number: ");
        int num2 = sc.nextInt();

        int answer = num1 > num2 ? num1:num2;
        System.out.println("Larger number: "+answer);
        sc.close();
    }
}
