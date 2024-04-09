public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int target = 0;
        System.out.println(position(arr,target));
    }
    public static int position(int[] arr , int target){
        int start = 0; int end = 1;
        while (arr[end]<target){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int[] arr , int target , int start , int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
