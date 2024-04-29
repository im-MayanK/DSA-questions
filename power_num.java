import java.util.*;
public class power_num{

public static long power_series(int a,int b)
{
    long result=0;
    if(b<=1)
    {
        return a;
    }
    else if(b%2==0)
    {
        //result=a*power_series(a, b-1);
        result=a*power_series(a, b/2);
    }

    else{
        result=2*a*power_series(a, b/2);
    }
   
    return result ;

}
        public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no.");
            int a=sc.nextInt();
            System.out.println("Enter the power of that no.");
            int b=sc.nextInt();
            long result=power_series(a,b);
           
            System.out.println(result*result);
            
            

        
    }
}
    

