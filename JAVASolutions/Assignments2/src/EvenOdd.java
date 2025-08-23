import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check if number is even or odd");
        System.out.println("What number will you like to check? ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("Your number is even");
        }else{
            System.out.println("Your number is odd");
        }

        sc.close();
    }
}

