import java.io.*;
import java.util.*;

public class Solution {
    public static long fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            long res=1;
            for(int i=2;i<=n;i++){
                res*=i;
            }
            return res;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
