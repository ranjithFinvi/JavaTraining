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
        Calculation cal =new Calculation();
        cal.simpleaddition();
        int intput1, input2,result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two Values:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        float c = a - b;
        intput1=20;
        input2=30;
        result=intput1*input2;
        System.out.println(c);
        System.out.println("Multiplication of two num is :"+result);

    }
}