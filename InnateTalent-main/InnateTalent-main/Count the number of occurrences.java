import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String number = sc.next();  
        char digit = sc.next().charAt(0);  
        
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
