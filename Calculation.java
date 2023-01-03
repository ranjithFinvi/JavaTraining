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

public class Calculation {

	public static void main ( String args []){
		System.out.println("multiplication of 4 * 5 = " + multiplication(4, 5, "*"))
	}	
	public int multiplication (int input1, int input2, String operand) {
		return input1 * input2;
	}
}