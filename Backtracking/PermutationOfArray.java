package Backtracking;
import java.util.ArrayList;
import java.util.List;

public class PermutationOfArray {
    
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void permut(int[] nums, int start, List<List<Integer>> result){

        if(start == nums.length){
            List<Integer> perm = new ArrayList<>();
            for(int num:nums){
                perm.add(num);
            }
            result.add(perm);
        }
        else{
            for(int i =start;i<nums.length;i++){
                swap(nums,start,i);
                permut(nums, start+1, result);
                swap(nums, start, i);
            }
        }
    }

    public static List<List<Integer>> permutations(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        permut(nums, 0, result);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permutations(nums));
    }

}
