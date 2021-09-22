import java.util.Scanner;

public class HourlyWage
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter the name of employee");
		String name = sc.nextLine();
		System.out.println("Enter base pay of the employee");
		float basePay = sc.nextFloat();
		System.out.println("Enter number of hours worked by the employee");
		int hours = sc.nextInt();
		float pay = 0f;
		if(hours>60){
		    System.out.println("Cannot work more than 60 hours");
		    System.exit(0);
		}
		else if(hours>40){
		    int extrahours = hours-40;
		    pay+=(40*basePay)+(extrahours*basePay*2);
		}
		else{
		    pay+=(hours*basePay);
		}
		
		System.out.println("Name :: "+name);
		System.out.println("Base Pay :: $"+basePay);
		System.out.println("Hours worked :: "+hours);
		System.out.println("Salary of employee :: $"+pay);
		
	}
	
	
}