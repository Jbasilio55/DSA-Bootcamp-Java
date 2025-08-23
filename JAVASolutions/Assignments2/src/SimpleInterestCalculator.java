import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal;
        int time;
        double rate;

        System.out.println("--------- Simple Interest Calculator -------");
        System.out.println("What is your Principle: ");
        principal = sc.nextInt();
        System.out.println("What is your Time: ");
        time = sc.nextInt();
        System.out.println("What is your Rate: ");
        rate = sc.nextDouble();

        double interest = principal * ( 1 + ((rate / 100) *time));
        System.out.println("Your interest is: "+interest);

        sc.close();
    }


}
