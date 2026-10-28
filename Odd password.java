import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNext()) {
            String s = scanner.next();
            char first = s.charAt(0);
            char third = s.charAt(2);
            char fifth = s.charAt(4);
          
            System.out.println("" + first + third + fifth);
        }
        
        scanner.close();
    }
}
