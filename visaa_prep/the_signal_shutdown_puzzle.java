import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mt[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mt[i][j]=sc.nextInt();
            }
        }
        boolean r[]=new boolean[n];
        boolean c[]=new boolean[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mt[i][j]==0){
                    r[i]=true;
                    c[j]=true;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(r[i]||c[j]){
                    mt[i][j]=0;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mt[i][j]+" ");
            }
            System.out.println();
        }
    }
}
