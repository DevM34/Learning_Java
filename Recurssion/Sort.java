package Recurssion;

public class Sort{
    public static void printJava(int array[]){
        for(int i = 0; i<array.length;i++)
            System.out.print(array[i]+" ");
        
            System.out.println();
    }
    //Bubble Sort
    public static void main (String[] args){
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