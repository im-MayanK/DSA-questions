import java.util.*;


class practice1{
public static long power_series(int a,int b)
{
    long result=0;
    if(b<=1)
    {
        return a;
    }
    else{
        result=a*power_series(a, b-1);
    }
   
    return result;

}
        public static void main(String[] args) {
             Scanner sc=new Scanner(System.in);
            System.out.println("Enter the no.");
            int a=sc.nextInt();
            System.out.println("Enter the power of that no.");
            int b=sc.nextInt();
            long result=power_series(a,b);
            System.out.println(result);

        
    }
}

