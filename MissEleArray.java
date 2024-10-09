public class MissEleArray {
    public static void missEleArray(int arr[]){
        int xor1 = arr[0];
        for(int i = 1; i < arr.length; i++){
            xor1 = xor1 ^ arr[i];
        }

        int xor2 = arr[0];
        int end = arr[arr.length-1] ;
        for(int i = arr[1]; i<=end; i++){
            xor2 = xor2 ^ i;
        }

        System.out.println(xor1^xor2);

    }

    public static void main(String args[]){
        int[] arr = {4,5,6,8,9};
        missEleArray(arr);
        
    }
}
