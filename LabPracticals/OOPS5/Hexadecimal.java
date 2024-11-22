import java.util.*;
public class Hexadecimal{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number in HexaDecimal number");
		String hexadecimalString = input.nextLine();
		if(!validHexaDecimalNumber(hexadecimalString)){
					 System.out.println("InValidHexaDecimalEException ex");
				 }
				 else{
					 System.out.println("The number:"+hexadecimalString+" is a valid hexadecimal number");
				 }
				 
			 }
			 static boolean validHexaDecimalNumber(String str){
	  return  str.matches("^[0-9a-fA-F]+$");
	}
}