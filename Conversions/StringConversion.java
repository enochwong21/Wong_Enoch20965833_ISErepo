import java.util.*;

public class Conversion
{
	public static void main(String []args)
	{
		mainMenuSelection();
	}
	
	public static void mainMenuSelection()
	{
		char returnMain = 0;
		int option = 0;
		Scanner sc = new Scanner(System.in);
		do
		{
		System.out.println("Please choose one of the following converter: ");
		System.out.println("1. Uppercase to Lowercase Converter");
		System.out.println("2. Lowercase to Uppercase Converter");
		option = getInt("Enter selection: ", 1, 5);
		System.out.print("\n");
		switch(option)
		{
		case 1:
			toLowerCase("");
			break;
		
		case 2:
			toUpperCase("");
			break;
		case 3:
			metersToFeetAndFeetToMeters();
			break;
			
		case 4:
			centiToInchesAndInchesToCenti();
			break;
		
		default:
			do
			{
			System.out.println("Are you sure you want to exit the program? (Y/N)");
			returnMain = sc.next().charAt(0);
			System.out.print("\n");
			if(returnMain == 'Y' || returnMain == 'y')
			{
				System.out.println("Goodbye :)");
				System.exit(0);
			}
			else if(returnMain == 'N' || returnMain == 'n')
			{
				mainMenuSelection();
			}
			else
			{
				System.out.println("Please enter Y/y or N/n only!\n");
			}
			}while(returnMain != 'Y' || returnMain != 'y' || returnMain != 'N' || returnMain != 'n');
			break;
		}
		}while(option <= 3);
		
	public static int getInt(String msg, int min, int max)
	{
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		boolean repeat = true;
		do
		{
		try
		{
			System.out.print(msg);
			ans = sc.nextInt();
			if(ans < min || ans > max)
			{
				System.out.println("\nThe input should be within " + min + "-" + max + ".\n");
			}
			else
			{
				repeat = false;
			}
		}
		catch(InputMismatchException e)
		{
			sc.nextLine();
			System.out.println("\nYour input is an non-integer.\n");
		}
		}while(repeat);//repeat when user enter non-integer
				
		return ans;
	}
	
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
    	
    	public static void metersToFeetAndFeetToMeters()
	{
		char returnMain = 0;
		int choice = 0;
		Scanner input = new Scanner(System.in);
		do
		{
		System.out.println("Please choose one of the following:");
		System.out.println("1. Convert Meters to Feet");
		System.out.println("2. Convert Feet to Meters");
		System.out.println("3. Return To Main Menu\n");
		choice = getInt("Enter selection: ", 1, 3);
		System.out.print("\n");
		switch(choice)
		{
			case 1:
				try
				{
				if(choice == 1)
				{
					System.out.print("Enter Value in Meters : ");
					double meter = input.nextDouble();
					double feet = meter * 3.28084;
					System.out.println("\n" + meter + " Meters = " + feet + " Feets\n");
				}
				}
				catch(InputMismatchException e)
				{
					input.nextLine();
					System.out.println("\nYour value is an non-integer.\n");
				}
				break;
			
			case 2:
				try
				{
				if(choice == 2)
				{
					System.out.print("Enter Value in Feet : ");
					double feet = input.nextDouble();
					double meter = feet / 0.3048;
					System.out.println("\n" + feet + " Feets = " + meter + " Meters\n");
				}
				}
				catch(InputMismatchException e)
				{
					input.nextLine();
					System.out.println("\nYour value is an non-integer.\n");
				}
				break;
				
			default:
				do
				{
					System.out.println("Do you want to return to main menu? (Y/N)");
					returnMain = input.next().charAt(0);
					System.out.print("\n");
					if(returnMain == 'Y' || returnMain == 'y')
				{
					mainMenuSelection();
				}
				else if(returnMain == 'N' || returnMain == 'n')
				{
					metersToFeetAndFeetToMeters();
				}
				else
				{
					System.out.println("Please enter Y/y or N/n only!\n");
				}
				}while(returnMain != 'Y' || returnMain != 'y' || returnMain != 'N' || returnMain != 'n');
		}
		}while(choice <=2);
		
	public static void centiToInchesAndInchesToCenti()
	{
		char returnMain = 0;
		int choice = 0;
		Scanner input = new Scanner(System.in);
		do
		{
		System.out.println("Please choose one of the following:");
		System.out.println("1. Convert Centimeters to Inches");
		System.out.println("2. Convert Inches to Centimeters");
		System.out.println("3. Return To Main Menu\n");
		choice = getInt("Enter selection: ", 1, 3);
		System.out.print("\n");
		switch(choice)
		{
			case 1:
				try
				{
				if(choice == 1)
				{
					System.out.print("Enter Value in Centimeters : ");
					double centimeters = input.nextDouble();
					double inches = centimeters * 2.54; // need fix
					System.out.println("\n" + centimeters + " Centimeters = " + inches + " Inches\n");
				}
				}
				catch(InputMismatchException e)
				{
					input.nextLine();
					System.out.println("\nYour value is an non-integer.\n");
				}
				break;
					
			case 2:
				try
				{
				if(choice == 2)
				{
					System.out.print("Enter Value in Inches : ");
					double inches = input.nextDouble();
					double centimeters = inches / 0.3937;
					System.out.println("\n" + inches + " Inches = " + centimeters + " Centimeters\n");
				}
				}
				catch(InputMismatchException e)
				{
					input.nextLine();
					System.out.println("\nYour value is an non-integer.\n");
				}
				break;
				
			default:
				do
				{
					System.out.println("Do you want to return to main menu? (Y/N)");
					returnMain = input.next().charAt(0);
					System.out.print("\n");
				if(returnMain == 'Y' || returnMain == 'y')
				{
					mainMenuSelection();
				}
				else if(returnMain == 'N' || returnMain == 'n')
				{
					metersToFeetAndFeetToMeters();
				}
				else
				{
					System.out.println("Please enter Y/y or N/n only!\n");
				}
				}while(returnMain != 'Y' || returnMain != 'y' || returnMain != 'N' || returnMain != 'n');
		}
		}while(choice <= 2);
	
}
