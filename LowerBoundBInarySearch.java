import java.util.Scanner;
import java.io.*;

public class LowerBoundBInarySearch {
    public static int Binarysearch1(int arr[], int m )
    {
        int low= 0;
        int high=arr.length-1;
       
        int result=-1;
           while(low<=high)
           {
            int mid=low+(high-low)/2;
            
            if(arr[mid]==m)
            {
                result=mid;
                // traverse to the left side of an array
                high=mid-1;
                
            }
            else if(arr[mid]<m)
            {
                low=mid+1;
            }
            else 
            {
                high=mid-1;
            }
            
           }
           return result;
           
     
    }
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of elements in array u need");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       
        System.out.println("Enter the element u want to find its location");
        int m=sc.nextInt();
        int result =Binarysearch1(arr,m );
        if(result==-1)
        {
            System.out.println("the desired element not found in array");
        }
        else
        {
        System.out.println("the desired element location is"+result);
        }

    }
    
}
