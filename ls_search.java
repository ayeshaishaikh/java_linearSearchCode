public class ls_search
{
    public static void main(String args[])
    {
        int[] arr = { 12, 23, 34 , 45, 56, 67, 78, 89, 90, 98, 87 };
        int target = 45;
        int start=1;
        int end=4;

        System.out.println(linearSearch( arr, target, start, end));

    }

    static int linearSearch(int[] arr, int target, int start , int end)
    {
        if(arr.length == 0 )
        {
            return -1;

        }

        //run a for loop
        for(int index = start; index <= end; index++)
        {
            int element = arr[index];
            if(element == target)
            {
                return index;
            }
        }
        return -1; 
    }
    

}
