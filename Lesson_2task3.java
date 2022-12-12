import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class task3 {

    private static Integer[] append(Integer[] arr, int element)
    {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);
 
        return list.toArray(new Integer[0]);
    }


    public static void main(String[] args)
    {
        int count = 0;
        Integer[] nums = { 1, -2, 35, -4, 1,2 };
        Integer[] sum_list = {};
        for (int i = 1; i < nums.length; i++) 
        {
            if ((nums[i] > 0) && ((nums[i] % 1 == 0))); 
            {
                sum_list.append(nums[i]);
            }
        };

        for (int i = 0; i < sum_list.length; i++) 
        {
            int sum = 0;
            sum +=  sum_list[i];
            System.out.print(sum);
        };
    }
}
