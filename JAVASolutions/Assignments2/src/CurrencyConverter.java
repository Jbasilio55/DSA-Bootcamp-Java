import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----Currency Converter-----");
        System.out.println("Which currency are you converting (dollars) or (rupees)? ");
        String currency = sc.nextLine();
        System.out.println("Amount to convert?");
        double amount = sc.nextDouble();

        double newAmount;

        if(currency.equals("dollars")){
            newAmount = amount * 87.31;
            System.out.println("Rupees: "+newAmount);
        }else{
            newAmount = amount / 87.31;
            System.out.println("Dollars: "+newAmount);
        }
        sc.close();
    }
}
