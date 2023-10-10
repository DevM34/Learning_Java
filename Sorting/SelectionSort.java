package Sorting;

public class SelectionSort {
    
    public static void printJava(int array[]){
        for(int i = 0; i<array.length;i++)
            System.out.print(array[i]+" ");
        
            System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {7,8,3,2,1};
        //Selection Sort
        for(int i=0;i<arr.length-1;i++){
            int small = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                     small = j;
                }
            }
            int temp = arr[i];
            arr[i] =arr[small];
            arr[small]=temp;
        }
        System.out.print("Selection Sort: ");
        printJava(arr);
    }
}
