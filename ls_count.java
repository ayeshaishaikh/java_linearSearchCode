//Given an array nums of integer  return how many of them contain an even number of digit 

public class ls_count
 {
    public static void main(String args[])
    {
        int[] nums = {12,345,5678,89765};
       System.out.println(findNumbers(nums));

        //System.out.println(digits(num:23456));

    }

    static int findNumbers(int[] nums)
    {

        int count = 0;
        for(int num : nums){
        if(even(num))
        {
            count++;


        }
        

        }
        return count;

    }
    //funcontain even to check whether a number contain even digit or not
    static boolean even (int num)
    {
        int numberOfDigits = digits(num);
        if(numberOfDigits % 2 == 0)
        {
            return true;

        }
        return false;
}
    // count number of digits in a number 
    static int  digits (int num)
    {
        if (num < 0)
        {
            num = num * -1;
        }

        if (num == 0)
        {
            return 1;
        }
        int count = 0;

        while ( num > 0)
        {
            count ++;
            num = num/10;

        }
        return count;

    }
  


    
}
