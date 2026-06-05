import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int marks = sc.nextInt();
        
        if(marks<=100 && marks>=90){
            System.out.println("A");
        }
        else if (marks<=89 && marks>=80){
            System.out.println("B");
        }
        else if (marks<=79 && marks>=70){
            System.out.println("C");
        }
        else if (marks<70){
            System.out.println("F");
        }
        sc.close();
    }
}
