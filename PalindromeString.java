import java.util.*;

public class PalindromeString {
    public static void paliString(String str){
        String Newstr = "";
        for (int i = str.length()-1; i >= 0; i--) {
            Newstr = Newstr + str.charAt(i);
        }

        if (str.equals(Newstr)) {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        paliString(str);
        sc.close();
    }
}
