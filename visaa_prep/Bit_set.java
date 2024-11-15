import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int k=sc.nextInt();
        if(k<=0){
            System.out.println("false");
        }
        long x=(long)Math.pow(2,k-1);
        if((n&x)!=0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
