class BubbleSort{
    public static void B_Sort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for(int i = 0 ; i<n-1 ; i++){
            swapped = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    swapped = true;
                }
            }
            if(!swapped){
                
                break;
            }
        }
    }
    public static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1 = {3,1,2,4,6,2,6,3,8};
        int[] arr2 = {1,2,3,4};

        System.out.println("Before Sorting");
        printArray(arr1);

        B_Sort(arr1);

        System.out.println("After Sorting");
        printArray(arr1);

    }
}