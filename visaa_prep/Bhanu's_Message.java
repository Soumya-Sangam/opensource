import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        if(num.length()==10 && code(num)){
            if(sum(num)>0)
                System.out.println("Correct");
            else
                System.out.println("Incorrect");
            return;
        }
        if(num.startsWith("+") && num.contains(" ") && num.indexOf(" ") < num.length()-10){
            String cc=num.substring(1,num.indexOf(" "));
            String p=num.substring(num.indexOf(" ")+1);
            if(cc.length()==1){
                System.out.println("Incorrect");
                return;
            }
            if(cc.length()==2 && code(cc) && p.length()==10 &&code(p)){
                if(sum(p)>0)
                    System.out.println("Correct");
                else
                    System.out.println("Incorrect");
            }
            else
                System.out.println("Incorrect");
        }
        else
            System.out.println("Incorrect");
    }
    public static boolean code(String str){
        for(char ch: str.toCharArray()){
            if(!Character.isDigit(ch))
                return false;
        }
        return true;
    }
    public static int sum(String str){
        int s=0;
        for(char ch : str.toCharArray()){
            s += Character.getNumericValue(ch);
        }
        return s;
    }
}
