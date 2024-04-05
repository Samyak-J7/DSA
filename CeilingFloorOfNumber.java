import java.util.Arrays;

public class CeilingFloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {10,14,65,77,90,95};
        int target = 19;
        System.out.println(Arrays.toString(ceiling_floor(arr, target)));
    }
    static int[] ceiling_floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        if (target<arr[start]){
            return new int[]{arr[start], -1};
        }
        if (target>arr[end]){
            return new int[]{-1,arr[end]};
        }

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return new int[]{arr[mid],arr[mid]};
            }
            else if (arr[mid]>target){
                end = mid -1;
            }
            else {
                start = mid + 1;
            }
        }
        return new int[]{arr[start],arr[end]};

    }
}
