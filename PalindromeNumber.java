public class PalindromeNumber {
    public static void main(String[] args) {
        int no = 112;
        int temp = no;
        int rev = 0;
        int rem;

        while (temp != 0) {
            
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if (no == rev) {
            System.out.println("The Given Number is Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
