import java.util.Scanner;
public class CalcRoot {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int num;     
        System.out.print("Enter an integer number: ");
        num=sc.nextInt();    
        System.out.println("Square Root of "+ num + " is: "+ Math.sqrt(num));
        System.out.println("cube Root of "+ num + " is: "+ Math.cbrt(num));
	}

}
