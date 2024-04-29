import java.util.*;
public class Selectionsort {
    public static void selectionsort(int[] arr)
    {
        
        for(int i=0;i<arr.length;i++)
        {
        // min_idx is taking the minimum element in every iteration
            int min_idx =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_idx])
                {
                    min_idx=j;
                }

            }            
           
            if(min_idx!=i)
            {
                int temp=arr[i];
                arr[i]=arr[min_idx];
                arr[min_idx]=temp;
            }

        }

    }
    public static void main(String[] args) {
        int arr[]={20,10,50,15,18,17,15,30};
        selectionsort(arr);
        System.out.println(" the sorted array is " + Arrays.toString(arr));
    }
    
}
