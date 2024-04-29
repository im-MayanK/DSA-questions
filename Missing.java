class Missing
{
    public static void main(String[] args) {
        int arr[]={1,2,4,6,7,5};
        int n=arr.length;
        //sum of natural number in an array-O(1)
        int sum_of_natural_number=((n+1)*(n+2))/2;
        int sum_of_arr=0;
        // sum of current elements in an array-O(n)
        for(int i=0;i<n;i++)
        {
            sum_of_arr+=arr[i];
        }
        int missing_Element=sum_of_natural_number - sum_of_arr;
        System.out.println(missing_Element);
       
    }

}