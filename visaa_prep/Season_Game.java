import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>12){
            System.out.println("Invalid");
        }
        else{
            if(n==3 || n==4 || n==5){
                System.out.println("Spring");
            }
            else if(n==6 || n==7 || n==8){
                System.out.println("Summer");
            }
            else if(n==9 || n==10 || n==11){
                System.out.println("Autumn");
            }
            else if(n==12 || n==1 || n==2){
                System.out.println("Winter");
            }
        }
    }
}
