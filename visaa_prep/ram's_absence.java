import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int cnt=0;
        int m=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==0){
                cnt++;
                m=Math.max(cnt,m);
            }
            else
                cnt=0;
        }
        System.out.println(m);
    }
}
