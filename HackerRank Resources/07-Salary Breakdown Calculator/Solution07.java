import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int ctc =  sc.nextInt();
        int hra = (ctc*20)/100;
        int pf  = (ctc*10)/100;
        int insurance  = (ctc*5)/100;
        int otherCharge = (ctc*5)/100;
        int takeHomeSalary = (ctc*60)/100;
        
        System.out.println("CTC: "+ctc);
        System.out.println("HRA: "+hra);
        System.out.println("PF: "+pf);
        System.out.println("Insurance: "+insurance);
        System.out.println("Other Charges: "+otherCharge);
        System.out.println("Take-home Salary: "+takeHomeSalary);
        sc.close();
    }
}
