package Recurssion.AdvancedRecursion;
import java.util.Scanner;
public class CountPath {

    public static int countPath(int i, int j, int n, int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==(n-1) && j==(m-1)){
            return 1;
        }

        //Downwards count
        int downCount = countPath(i+1,j,n,m);

        //Rightwards count
        int rightCount = countPath(i,j+1,n,m);

        return downCount + rightCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n  : ");
        int n=sc.nextInt();
        System.out.println("Enter m:");
        int m =sc.nextInt();
        int totalPath = countPath(0, 0, n, m);
        System.out.println("Total path: " +totalPath);
        sc.close();
    }
}
