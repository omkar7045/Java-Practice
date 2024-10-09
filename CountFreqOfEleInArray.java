public class CountFreqOfEleInArray {
    public static void countFreqOfEleInArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int count = 0;
            int x = arr[i];

            if(x == -1){
                continue;
            }
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==x){
                    count++;
                    arr[j]=-1;
                }
            }
            System.out.println(x + " " + count);
        }
    }
    public static void main(String[] args) {
        int[] arr = {10,10,10,20,20,10,30};
        countFreqOfEleInArray(arr);
    }
}
