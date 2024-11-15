import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        int num1=0;
        int num2=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%m==0)
                num1 +=arr[i];
            else 
                num2 +=arr[i];
        }
        System.out.println(num1-num2);
        
    }
}
