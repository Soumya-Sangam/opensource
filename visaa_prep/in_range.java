import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            if(67<=n && n<=45000){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}
