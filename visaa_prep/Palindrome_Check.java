import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String r="";
        for(int i=str.length()-1;i>=0;i--){
            r +=str.charAt(i);
        }
        if(str.equals(r)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}
