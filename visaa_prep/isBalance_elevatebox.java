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
        int b[]=new int[n];
        int sum=0;
        int ls=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        for(int i=0;i<n;i++){
            int rs=sum-ls-arr[i];
            b[i]=Math.abs(ls-rs);
            ls+=arr[i];
            System.out.print(b[i]+" ");
        }
    }
}
