import java.util.Scanner;

public class FencingABarn
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Select an option from list to calculate area of fence");
		System.out.println("1. Square area for the chickens");
		System.out.println("2. Circular area for ducks");
		System.out.println("3. Rectangular area for cows");
		
		int choice = sc.nextInt();
		switch(choice){
		    case 1: squareArea();   break;
		    case 2: circularArea(); break;
		    case 3: rectangularArea();  break;
		    default: System.out.println("Wrong Choice");
		}
	}
	
	static void squareArea(){
	    System.out.println("Enter side of square :");
	    Scanner sc = new Scanner(System.in);
	    float side = sc.nextFloat();
	    System.out.println("Area of square fence for chickens is: "+(side*side));
	}
	
	static void circularArea(){
	    System.out.println("Enter radius of circle :");
	    Scanner sc = new Scanner(System.in);
	    float radius = sc.nextFloat();
	    System.out.println("Area of circular fence for chickens is: "+(radius*radius*3.14));
	}
	
	static void rectangularArea(){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter length of rectangle :");
	    float length = sc.nextFloat();
	    System.out.println("Enter breadth of rectangle :");
	    float breadth = sc.nextFloat();
	    System.out.println("Area of rectangular fence for chickens is: "+(length*breadth));
	}
}
