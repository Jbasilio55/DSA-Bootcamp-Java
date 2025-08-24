import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your first number?");
        int firstNum = sc.nextInt();
        System.out.println("What is your second number?");
        int secondNum = sc.nextInt();
        System.out.println("What is your operator add(+), minus(-), multiply(*), divide(/)?: ");
        sc.nextLine();
        String operator = sc.nextLine();

        int answer;

        if(operator.equals("+")){
            answer = firstNum + secondNum;
            System.out.println("Answer: "+ answer);
        } else if (operator.equals("-")) {
            answer = firstNum - secondNum;
            System.out.println("Answer: "+ answer);
        } else if (operator.equals("*")) {
            answer = firstNum * secondNum;
            System.out.println("Answer: "+ answer);
        }else{
            if(secondNum == 0){
                System.out.println("You can not divide by zero");
            }else{
                answer = firstNum / secondNum;
                System.out.println("Answer: "+ answer);
            }
        }

        sc.close();
    }
}
