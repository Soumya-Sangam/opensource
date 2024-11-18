import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String s="";
        for(int i=0;i<str.length();i++){
            char a=str.charAt(i);
            if(Character.isUpperCase(a)){
                s += Character.toLowerCase(a);
            }
            else{
                s += Character.toUpperCase(a);
            }
        }
        System.out.println(s);
    }
}
