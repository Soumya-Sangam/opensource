import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        if(n>=10){
            for(int i=0;i<n;i++){
                arr[i]=i;
            }
        }
        else{
            for(int i=1;i<=n;i++){
                arr[i-1]=i;
            }
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(arr[i]);
        }
        System.out.println(l);
    }
}
