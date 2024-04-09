public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(findInMountainArray(5,arr));
    }

    public static int findInMountainArray(int target, int[] mountainArr) {
        int peak = peakIndexMountainArray(mountainArr);
        int firstHalf = binarySearch(mountainArr,target,0,peak);
        if (firstHalf != -1){
            return firstHalf;
        }
        else {
            return binarySearch(mountainArr,target,peak+1, mountainArr.length-1);
        }
    }

    public static int peakIndexMountainArray(int[] arr){
        int start = 0; int end = arr.length-1;
        while (start<end){
            int mid = start + (end - start) /2;
            if (arr[mid]>arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    public static int binarySearch(int[] arr, int target , int start , int end ){
        boolean isAsc = arr[start]<arr[end];
         while (start <= end){
             int mid = start + (end - start) /2;
             if (arr[mid] == target ){
                 return mid;
             }
             if(isAsc) {
                 if (arr[mid] > target) {
                     end = mid - 1;
                 } else {
                     start = mid + 1;
                 }
             }
             else {
                 if (arr[mid] < target) {
                     end = mid - 1;
                 } else {
                     start = mid + 1;
                 }
             }
         }
         return -1;
    }
}
