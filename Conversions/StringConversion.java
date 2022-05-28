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
	
	public static String toUpperCase(String userInput)
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
				System.out.println("Lowercase to Uppercase : " + removeAllDigit(userInput).toUpperCase() + "\n");
				repeat = false;
			}		
		}while(repeat);
	}
	
	public static StringBuilder checkNumericInString(String input)
	{
		char[] chars = input.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char c : chars)
		{
			if(Character.isDigit(c))
			{
				sb.append(c);
			}
		}
		return sb;
	}
	
	public static String removeAllDigit(String str)
    	{
        // Converting the given string
        // into a character array
        char[] charArray = str.toCharArray();
        String result = "";
  
        // Traverse the character array
        for (int i = 0; i < charArray.length; i++) 
        {
  
            // Check if the specified character is not digit
            // then add this character into result variable
            if (!Character.isDigit(charArray[i])) 
            {
                result = result + charArray[i];
            }
        }
        // Return result
        return result;
    	}
	
}
