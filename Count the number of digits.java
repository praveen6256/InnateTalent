import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
   long num=sc.nextLong();
        long count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}
