// time complexity: O(n^2)
// space complexity: O(1)
import java.util.Arrays;
public class Insertionsort {
    public static void insertionsort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;

                j--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={20, 50, 25, 67, 79, 12, 15};
        insertionsort(arr);
        System.out.println("the sorted array is "+ Arrays.toString(arr));
    }
    
}
