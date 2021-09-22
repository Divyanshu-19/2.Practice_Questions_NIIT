import java.util.Scanner;

public class DigitalCalander
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter month(Press 1 for Jan, 2 for Feb, 12 for Dec....)");
		int month = sc.nextInt();
		System.out.println("Enter Year:");
		int year = sc.nextInt();
		System.out.println("Enter Day of week(Press 1 for Mon, 2 for Tue, 7 for Sun...");
		int dayofWeek = sc.nextInt();
		
		System.out.println("S  M  Tu W  Th F  S");
		int daysInMonth = daysInMonth(month, year);
		for(int i=0; i<daysInMonth; i++){
		    if(i==0){
		        int spaceGap = dayofWeek%7;
		        for(int j=0; j<spaceGap; j++){
		            System.out.print("   ");
		        }
		    }
		    if(i<9){
		        System.out.print(" "+(i+1)+" ");
		    }
		    else{
		        System.out.print(i+1+" ");
		    }
		    if((dayofWeek+i+1)%7==0){
		        System.out.println();
		    }
		    
		}
		
	}
	
	static int daysInMonth(int month, int year){
	    if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
	        return 31;
	    }
	    else if(month!=2){
	        return 30;
	    }
	    else{
	        if(year%400==0)
	            return 29;
	        if(year%100==0)
	            return 28;
	        if(year%4==0)
	            return 29;
	        return 28;
	    }
	}
	
	
}
