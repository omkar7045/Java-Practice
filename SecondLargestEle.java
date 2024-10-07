

public class SecondLargestEle {

    public static void main(String[] args) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        int arr[] = {4,2,6,3,8,1,9};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>first) {
                second = first;
                first = arr[i];
            }
            else if (arr[i]>second && arr[i]!=first) {
                second = arr[i];
            }
        }
        System.out.println("Second Largest Element Is : " + second);
    }
}
