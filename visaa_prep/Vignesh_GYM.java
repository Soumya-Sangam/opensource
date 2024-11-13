import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        for(int i=0;i<3;i++){
            arr[i]=sc.nextInt();
        }
        if((arr[0]+arr[1])<=arr[2]){
            System.out.println("2");
        }
        else if(arr[0]<=arr[2]){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
