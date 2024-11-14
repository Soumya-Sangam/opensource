import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        boolean isleap=false;
        if(y%4==0){
            isleap=true;
            if(y%100==0){
                if(y%400==0){
                    isleap=true;
                }
                else
                    isleap=false;
            }
        }
        else
            isleap=false;
        if(isleap){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
