package Assignments.Assingment2;
import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        int[] arr=Arrays.stream(nums).distinct().toArray();
        Arrays.sort(arr);
        if(arr.length>=3){
            return arr[arr.length-3];
        }
        else{
            return Arrays.stream(arr).max().getAsInt();
        }
    }
}
