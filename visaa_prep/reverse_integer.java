import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=0;
        while(n!=0){
            int d=n%10;
            n=n/10;
            if((r>Integer.MAX_VALUE/10) || (r==Integer.MAX_VALUE/10 && d>7)){
                System.out.println("0");
                return;
            }
            if((r<Integer.MIN_VALUE/10) || (r==Integer.MIN_VALUE/10 && d<-8)){
                System.out.println("0");
                return;
            }
            r=r*10+d;
        }
        System.out.println(r);
    }
}
