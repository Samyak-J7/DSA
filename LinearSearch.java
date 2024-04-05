public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int num = -0;
        if (search(arr,num)){
            System.out.println("Number found");
        }
        else {
            System.out.println("Number not found");
        }

    }
    static boolean search(int[] arr , int num){
        for(int i : arr){
            if (i == num){
                return true;
            }
        }
        return false;
    }
}
