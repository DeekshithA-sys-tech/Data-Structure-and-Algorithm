

class SelectionSort{
    public static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
            
        }
    }
    public static void printArray(int[] arr){
        
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr = {9,2,5,1,6,7,8};
        System.out.println("before sorting ");
        printArray(arr);

        sortArray(arr);

        System.out.println("after sorting");
        printArray(arr);
    }
}
