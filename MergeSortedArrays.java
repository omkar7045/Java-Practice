import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(long[] arr1, long[] arr2){
        int left = arr1.length -1;
        int right = 0;

        while(left >= 0 && right <= arr2.length){
            if (arr1[left] > arr2[right]) {
                long temp = arr1[left];
                arr1[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
    public static void main(String[] args) {
        long[] arr1 = {1,3,5,7};
        long[] arr2 = {0,2,4,8};

        merge(arr1, arr2);
        
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
        }

    }
}
