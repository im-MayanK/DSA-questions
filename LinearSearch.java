import java.util.*;
import java.io.*;
// time complexity is O(n)
// space complexity is O(1)
public class LinearSearch {
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
        int idx= -1;
        System.out.println("Enter the element u want to find its location");
        int m=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(arr[i]==m)
            {
                idx=i;
                System.out.println("the index location of desired element is"+idx);
                break;
            }
        }
        if(idx==-1)
        {
            System.out.println("the desired element is not present in array");
        }

    }
    
}
