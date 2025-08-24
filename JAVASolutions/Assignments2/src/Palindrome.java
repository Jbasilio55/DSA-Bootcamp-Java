import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check if a word is a palindrome?");
        System.out.println("word: ");

        String word = sc.nextLine();
        word = word.toLowerCase();
        int length = word.length() - 1;
        boolean isPalendrome = true;

        for(int i = 0; i < length  / 2; i++){
            if(word.charAt(i) != word.charAt(length-i)){
                isPalendrome = false;
            }
        }

        if(isPalendrome){
            System.out.println("Word is a palindrome");
        }else{
            System.out.println("Word is not a palindrome");
        }

        sc.close();
    }
}
