
import java.util.*;
public class Squareroot {
    public static long Squareroot1(long num)
    {
        long low=0;
        long high=num;
        long result=0;
        while(low<=high)
        {
             long mid=low+(high-low)/2;
             long var=mid*mid;
             if(var==num)
             {
                return mid; 
             }
             else if(var>num)
             {
                high=mid-1;

             }
             else
             {
                result=mid;
                low=mid+1;
             }
        }
        return result;

    }
    

    
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter no. you want to find its square root ");
        long num= scan.nextInt();
        long result=Squareroot1(num);
        System.out.println("the square root of a no. is"+result);
        
    }
    
}
