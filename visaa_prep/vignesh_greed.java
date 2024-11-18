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
        Arrays.sort(arr);
        int sum=0;
        for(int i=n-1;i>=2;i--){
            if(arr[i-1]+arr[i-2]>arr[i]){
                sum=arr[i-1]+arr[i-2]+arr[i];
                System.out.println(sum);
                return;
            }
        }
        System.out.println(-1);
    }
}
