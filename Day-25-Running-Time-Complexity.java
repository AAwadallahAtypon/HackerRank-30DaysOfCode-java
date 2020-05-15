import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        
        int items = sc.nextInt();

        for(int i=0;i<items;i++){
        int input = sc.nextInt();
        if(input > 2 && isPrime(input)){
            System.out.println("Prime");
        }
        else{
             System.out.println("Not prime");
        }
        }
    }

    public static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                return false; }
        }
        return true;
    }
    }
