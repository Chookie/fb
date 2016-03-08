package B_SecondScreen;

import java.util.HashSet;
import java.util.Set;

/**
 * Return true if target is sum of any sequence of numbers in array.
 * Sample [3,1,6,10], target 7
 * 3 = too low, set=3
 * 3 + 1 = 4 too low, set=3,4
 * (4) + 6 = 10 too high
 * Rather than starting again from beginning of array just subtract sum and see if already have that in set
 * if (sum - target) is in set then true
 * E.g. 10-7=3, we is in set, so we know somewhere from 3,1,6 we have a total of 7
 *
 * So for 16 we get to the 10 and set=3,4,10 and sum 20
 * 20-16=4, we have 4 as second value in set so this is true (last 2 array elements)
 */
public class ArrayContainsTotal {
    public static boolean arrayContains(int[] array, int target) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
            if(sum == target){
                return true;
            } else if (sum < target){
                set.add(sum);
            } else {
                int find = sum - target;
                if(set.contains(find)){
                    return true;
                }
            }
        }
        return false;
    }
}
