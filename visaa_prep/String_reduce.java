import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                continue;
            }
            int cnt=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    cnt++;
                    arr[j]=0;
                }
                else{
                    break;
                }
            }
            System.out.print(arr[i]+""+cnt);
        }
    }
}
