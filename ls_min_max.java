public class ls_min_max
{
    public static void main(String args[])
    {
        int[] arr = {65, 54, 43, 32, 34};
        System.out.println("the given array is : ");

        for(int i =0; i<arr.length; i++)
        {
            
            System.out.print(+ arr[i] + " ");
        }
        System.out.println();

        System.out.println("the mininum element is : " + min(arr));
        System.out.println("the maximum element is : " + max(arr));

    }
    static int min(int[] arr)
    {
        int ans = arr[0];
        for(int i = 1; i< arr.length; i++)
        {
            if(arr[i] < ans)
            {
                ans = arr[i];
            }
        }
        return ans;

    }

    static int max(int[] arr)
    {
        int ans = arr[0];
        for(int i = 1; i< arr.length; i++)
        {
            if(arr[i] >  ans)
            {
                ans = arr[i];
            }
        }
        return ans;

    }
    
    
}
