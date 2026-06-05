import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fName = sc.nextLine();
        String lName = sc.nextLine();
        int age = sc.nextInt();
        double height = sc.nextDouble();
        boolean likes = sc.nextBoolean();
        
        
        System.out.println("Hello, my name is "+fName+" "+lName+". I am "+age+" years old, "
        +height+" meters tall, and it is "+likes+" that I like programming!");
    }
}
