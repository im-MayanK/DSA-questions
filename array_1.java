public class array_1 {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6,7};
        int b[]={1,2,3,4,5,6,7};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i]+b[i];
        }
        System.out.println(sum);

    }
    
}
