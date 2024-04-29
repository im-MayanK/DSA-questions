import java.util.Scanner;

class Recursion
{
    public static int Factorial(int a)
    {
        int result=0;
        if(a==1||a==0)
        {
            return 1;
        }
        result=a*Factorial(a-1);
        return result;

        }
        

    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value");
        int a=scan.nextInt();
        int result= Factorial(a);
        System.out.println(result);
    }
}