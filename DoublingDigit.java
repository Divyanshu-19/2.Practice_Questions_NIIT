import java.util.Scanner;

public class DoublingDigit
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter number");
		int num = sc.nextInt();
		
		String result = "";
		String numString = Integer.toString(num);
		for(int i=0; i<numString.length(); i++){
		    
		    if(numString.charAt(i)=='-' && i==0){
		        result+=numString.charAt(i);
		        continue;
		    }
		    else if(numString.charAt(i)=='0' && i==0){
		        result+=numString.charAt(i);
		        break;
		    }

		  
		  result+=Character.toString(numString.charAt(i));
		  result+=Character.toString(numString.charAt(i));
		}
		
		System.out.println("Result : "+Integer.parseInt(result));
	}
	
	
}
