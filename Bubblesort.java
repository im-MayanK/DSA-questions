import java.util.Arrays;
// time ecomplexity is O(n2)
// space complexity is O(1)
public class Bubblesort {
    public static void Bubblesort(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            boolean swapped=false;
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                } 
            }
            if(!swapped)
            {
                break;
            }
        }

    }
    public static void main(String[] args) {
        // array defination
        int arr[] ={20, 50, 10, 12, 45, 67, 90};
        Bubblesort(arr);
        System.out.println("the sorted is"+ Arrays.toString(arr));
       
    }
    
}
