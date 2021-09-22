import java.util.Scanner;

public class SwapDigit
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Number:");
		long num = sc.nextLong();
		
		int digits = 0;
		long temp = num;
		while(temp>0){
		    temp = temp/10;
		    digits+=1;
		}
		
		String numString = Long.toString(num);
		String result = "";
		for(int i=0; i<digits; i++){
		    if(i==0 && digits%2!=0){
		        result=result+numString.charAt(i);
		        continue;
		    }
		    result=result+numString.charAt(i+1)+numString.charAt(i);
		    i+=1;
		    
		}
		System.out.println(result);
		
	}
}