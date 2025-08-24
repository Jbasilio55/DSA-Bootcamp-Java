import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check if number is armstrong: ");
        int num = sc.nextInt();
        boolean armStrong = isArmstrong(num);

        if(armStrong){
            System.out.println("Number is an Armstrong Number");
        }else{
            System.out.println("Number is not a Armstrong Number");
        }

        sc.close();
    }

    public static boolean isArmstrong(int num){
        int originalNum = num; // copy num
        int numberOfDigits = String.valueOf(num).length(); // Count the number of digits
        int sum = 0;

        while(num > 0){
            int digit = num % 10; // Extract the last digit
            sum += Math.pow(digit, numberOfDigits);  // Raise digit to the power of number of digits and add to sum
            num /= 10; // Remove the last digit
        }

        return sum == originalNum;
    }
}
