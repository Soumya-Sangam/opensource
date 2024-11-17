import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int arr1[]=new int[n];
        for(int i=0;i<n-1;i++){
            arr1[i]=arr[i+1];
        }
        arr1[n-1]=arr[0];
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
