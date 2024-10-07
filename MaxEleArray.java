public class MaxEleArray {
    public void maxEleArray(int arr[]){
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max Ele :" + max);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,1,5};
        MaxEleArray obj = new MaxEleArray();
        obj.maxEleArray(arr);
    }
}
