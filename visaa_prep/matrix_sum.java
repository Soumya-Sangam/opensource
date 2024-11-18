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
        int r[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                r[i] += m[i][j];
                c[j] += m[i][j]; 
            }
        }
        for(int i=0;i<n;i++){
            int ans = r[i]+c[i];
            System.out.print( ans + " ");
        }
    }
}
