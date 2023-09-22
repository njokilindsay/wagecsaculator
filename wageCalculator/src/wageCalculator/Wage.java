package wageCalculator;
import java.util.Scanner;
public class Wage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Wage Calculator");
System.out.println("----------------");
Scanner input = new Scanner(System.in);
System.out.print("Enter your RegNo: ");
String regNo = input.next();
System.out.print("Enter hourly pay rate: ");
Double payrate = input.nextDouble();
System.out.print("Enter hours worked: ");
int hrs = input.nextInt();
System.out.println(" ");
System.out.println("Wage Details:");
System.out.println("Reg No:"   +regNo);
System.out.println("Hourly Pay Rate:       $" +payrate);
System.out.println("Hours Worked:          "+ hrs);
System.out.print("Total Wages:           $"+ payrate * hrs);
	}

}
 