import java.util.Scanner;

public class Calculation {
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two Values:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        float c = a - b;
        System.out.println(c);
    }
}