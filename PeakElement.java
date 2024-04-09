public class PeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(findPeakElement(nums));
    }
    public static int findPeakElement(int[] nums) {
        int start =0;
        int end = nums.length-1;
        while (start < end){
            int mid = start + (end - start)/2;
            if (nums[mid]<nums[mid+1]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
