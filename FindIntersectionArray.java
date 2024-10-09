import java.util.ArrayList;

public class FindIntersectionArray {
    public static ArrayList<Integer> findIntersectionArray(int a[],int b[]){
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0;
        int j = 0;
        while(i < a.length && j < b.length){
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                list.add(a[i]);
                i++;
                j++;
            }
        }
        return list;
    }

    public static void main(String args[]){
        int[] a = {3,4,5,5,7};
        int[] b = {4,5};

        ArrayList<Integer> list = findIntersectionArray(a, b);

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i)+" ");
        }
    }
}
