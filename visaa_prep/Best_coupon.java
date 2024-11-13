import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        float per=((x*10)/100);
        int flat=100;
        if(per<flat){
            System.out.println(x-flat);
        }
        else{
            System.out.println(x-(int)per);
        }
    }
}
