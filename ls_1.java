import java.lang.annotation.Target;

public class ls_1
{
    public static void main(String args[])
    {
        int[] nums = { 23, 45, 67, 78, 89, 87, 76 };
        int target = 89;
        //for linearSearch
        //int ans = linearSearch(nums, target);

         //for linearSearch_1
         boolean ans = linearSearch_1(nums, target);
        System.out.println("the element is  : " + ans);
    }
        //search in the array: return the index if item found 
        //otherwise if item not found retyrn -1 


        //linear search..function name 

        
        //1st way..by finding index of element 
        /*static int linearSearch(int[] arr, int target )
        {
            if(arr.length == 0 )
            {
                return -1;
            }
            for(int index =0; index<arr.length; index++)
            {
                //check for element at every index if it is = target
                //if length is 6 then 0 to 5

                int element = arr[index];
                if(element == target)
                {
                    return index;
                }

            }
            //this line will execute if none of the return stmt above have executed hence the target not found 
            return -1;
        }*/

        //2nd way by find ekement and show element itself
        static boolean linearSearch_1(int[] arr, int target )
        {
            if(arr.length == 0 )
            {
                return false;
            }
            
            //run for loop
            //enhance for loop
            for(int element : arr)
            {
                if(element == target)
                {
                    return true ;
                }
            }
            //this line will execute if none of the return stmt above have executed hence the target not found 
            /*return -1;
            bt -1 can be one of element in array so i have to change this */
            return false;
        }
    
}