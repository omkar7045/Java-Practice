import java.util.HashSet;

public class RemoveDuplicateEleInArray {
    public static void main(String args[]){
        int[] arr = {1,2,3,3,4,5,5};

        HashSet<Integer> ans = new HashSet<>();

        for(int i = 0; i < arr.length; i++){
            ans.add(arr[i]);
        }

        for(int i : ans){
            System.out.println(i);
        }
    }
}
