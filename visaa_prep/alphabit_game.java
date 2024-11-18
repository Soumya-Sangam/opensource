import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toLowerCase();
        int cnt=0;
        int cnt1=0;
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
                cnt++;
            }
            else if(a>='a' && a<='z'){
                cnt1++;
            }
        }
        System.out.println(cnt+","+cnt1);
    }
}
