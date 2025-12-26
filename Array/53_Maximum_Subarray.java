//Dynamic problem Maximum Subarray Sum
class MaximumSubarray
{
 public static int maxSubarray(int[] arr)
    {
int maxi=Integer.MIN_VALUE;
int sum=0;
for(int i=0;i<arr.length;i++)
{
    sum+=arr[i];
if(sum>maxi)
{
maxi=sum;
}
if(sum<0)
{
    sum=0;

}
}
return maxi;
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-1,-5,
            6};
        int result=maxSubarray(arr);
        System.out.println("MaximumSubarray  Sum is:"+ result);
    }
}