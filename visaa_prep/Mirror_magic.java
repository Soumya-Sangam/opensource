import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                m[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int s=0;
            int e=n-1;
            while(s<e){
                int t=m[i][s];
                m[i][s]=m[i][e];
                m[i][e]=t;
                s++;
                e--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}
