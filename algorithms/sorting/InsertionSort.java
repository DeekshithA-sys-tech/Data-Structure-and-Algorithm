
class InsertionSort{
    public static void solution(int[] arr) {
        
        int n=arr.length;
        for (int i = 1; i < n; i++) {
            int smallValue = arr[i];
            int j= i-1;
            while ( j>=0 && arr[j]>smallValue) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=smallValue;
            }
        }
    
    public static void printArray(int[] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4,2,1,3,6,5,8,7,9};
        System.out.println("Before Insertion sort");
        printArray(arr);
        solution(arr);
        System.out.println("After Insertion Sort");
        printArray(arr);
    }
}