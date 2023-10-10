package Sorting;

public class BubbleSort {

    public static void printJava(int array[]){
        for(int i = 0; i<array.length;i++)
            System.out.print(array[i]+" ");
        
            System.out.println();
    }

    public static void main(String[] args) {
        
        int[] arr = {7,8,3,2,1};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
            }
        }
        System.out.print("Bubble Sort: ");
        printJava(arr);
    }
}
