public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2};
        int[] arr2 = {40,30,20,10,9,4,2,1};
        int target = 2;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr , int target){
            int start = 0;
            int end = arr.length-1;
            boolean isAsc = arr[start]< arr[end];
            while (start <= end){
                int mid = start + (end - start)/2;
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
