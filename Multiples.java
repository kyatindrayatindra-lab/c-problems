package day13;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String ip =""; int part =0,cur=0;
        try{
            System.out.println("Enter the Ip to Validate ");
            ip = scan.next();
            String[] splited = ip.split("\\.");
            while(part<4){
                cur = Integer.parseInt(splited[part]);
                if(cur<0||cur>=256)
                {System.out.println("Invalid Ip"); return;}
                part++;
            }
            System.out.println("Ip is Valid ");
        }catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
            if(e.getClass().getName()=="java.lang.NumberFormatException")
                System.out.println("Ip in Numarical");
            else System.out.println("Ip should be 4 portions of numbers");
            main(args); 
        }
        scan.close();
    }
}
