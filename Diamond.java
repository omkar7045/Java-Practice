public class Diamond {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int m = 2; m <= i; m++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            for (int m = 4; m >=i; m--) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
