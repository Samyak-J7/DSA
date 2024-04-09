import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,9};
        int target =7;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] index =  {-1,-1};
        index[0] = search(nums,target,true);
        if (index[0] != -1) index[1] = search(nums,target,false);
        return index;
    }
    public static int search(int[] nums , int target ,boolean isStart){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while (start <= end){
            int mid = start + (end - start) /2;
            if ( nums[mid] == target ){
                ans = mid;
                if (isStart) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else if ( nums[mid] > target ){
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        return ans;
    }
}

