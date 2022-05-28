import java.util.*;

public class Conversion
{
	public static String toLowerCase(String userInput)
	{
		char returnMain = 0;
		Scanner sc = new Scanner(System.in);
		boolean repeat = true;
		do
		{
			if(userInput == null || userInput.isEmpty())
			{
				System.out.print("Please enter a string: ");
				userInput = sc.nextLine();
			}
			else 
			{				
				System.out.println("\nInteger in String is: " + checkNumericInString(userInput));
				System.out.println("Uppercase to Lowercase : " + removeAllDigit(userInput).toLowerCase() + "\n");
				repeat = false;
			}		
		}while(repeat);
	}
	
	
}
