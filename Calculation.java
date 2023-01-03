import java.util.Scanner;
public class Calculation{

public void simpleaddition(){
Scanner scan=new Scanner(System.in);
System.out.println("Enter the numbers for x,q:");
int x=scan.nextInt();
int q=scan.nextInt();
int r=x+q;
System.out.println("output=" +r);
}
public static void main(String args[]){
Calculation c=new Calculation();
c.simpleaddition();
}
}