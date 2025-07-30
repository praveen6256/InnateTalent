import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    char alphabet=sc.next().charAt(0);
        if(alphabet>='A' && alphabet<='Z'){
            System.out.println("UPPERCASE");
        }else if(alphabet>='a' && alphabet<='z'){
            System.out.println("LOWERCASE");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
