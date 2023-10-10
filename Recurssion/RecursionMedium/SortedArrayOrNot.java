package Recurssion.RecursionMedium;

public class SortedArrayOrNot {
    // Sorted or not Array
    public static boolean sortedArr(int[] arr, int b){
        if(b==arr.length-1)
            return true;
        if(arr[b]>arr[b+1])
            return false;
        return sortedArr(arr, b+1);
    }

    public static void main(String[] args) {
        //Sorted arra or not
        int[] a = {1,3,4,5};
        boolean ans = sortedArr(a, 0);
        System.out.println(ans);
    }
}
