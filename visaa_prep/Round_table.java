import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(fact(x-1)*2);
    }
    public static long fact(int x){
        long ans=1;
        for(int i=2;i<=x;i++){
            ans*=i+1;
        }
        return ans;
    }
}
