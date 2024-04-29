import java.util.*;
public class Fibonacci {
    public static int Fibonacci_find(int num)
    {
        int result=0;
        if(num<=1)
        {
            return num;
        }
        else {
            result=Fibonacci_find(num-1)+Fibonacci_find(num-2);
            
        }
        return result;
        
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the n no. ");
        int num=scan.nextInt();
        int result=Fibonacci_find(num);
        System.out.println(result);
        
    }
    
}
