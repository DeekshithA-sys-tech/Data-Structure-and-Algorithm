public class LinearSearch {
    public static void linearSearch(int[] arr,int target){
        int n = arr.length;
        int found = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==target){
                found=1;
                System.out.println("target value found @ index "+i);
                break;
            }
        }
        if(found ==0){
            System.out.println("target value does not found");
        }
    }
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        linearSearch(arr, target);
    }
}