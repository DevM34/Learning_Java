package Sorting;

public class InsertionSort {
    
    public static void printJava(int array[]){
        for(int i = 0; i<array.length;i++)
            System.out.print(array[i]+" ");
        
            System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {7,8,3,2,1};

        //Insertion Sort
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int j = i-1;
            while(j>=0 && curr<arr[j] ){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        System.out.print("Insertion Sort: ");
        printJava(arr);
    }
}
