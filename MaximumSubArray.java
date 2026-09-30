import java.util.Arrays;

public class MaximumSubArray{
    public static void main(String []args)
    {
        int[] arr = {-1,2,3,1,-8};
       int []maxArr= findMaxSubArray(arr);
       System.out.println(Arrays.toString(maxArr));
    }

    public static int[] findMaxSubArray(int[] arr)
    {
       
        int currentSum= arr[0];
        int maxSum = arr[0];

        int start = 0;
        int end =0;
        int tempStart =0;

        for(int i=1;i<arr.length;i++)
        {
             //  int arr = {-1,2,3,1,8};
            if (arr[i]>currentSum+arr[i])
            {
                currentSum= arr[i];
                tempStart =i;
            }
            else{
                currentSum = currentSum+arr[i];
            }

            if(currentSum>maxSum)
            {
                 maxSum=currentSum;
                 start= tempStart;
                 end=i;

            }
        }

        return Arrays.copyOfRange(arr,start,end+1);
    }
}