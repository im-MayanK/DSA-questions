//import java.util.*;
class St1{
    int age;
    String name; 
    St1(int age, String name )
    {
        this.age=age;
        this.name=name;
       
    }
    public String toString()
    {
        return age+name;

    }

}
public class TOSTRING {
    public static void main(String[] args) {
        St1 obj=new St1(20,"Mayank");
        System.out.println(obj);
        
    }
    
}
