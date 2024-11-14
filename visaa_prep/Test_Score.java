import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        boolean able=false;
        for(int i=0;i<n;i++){
            if(i*x==y)
                able=true;
        }
        if(able)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
