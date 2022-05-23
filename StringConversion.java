import java.util.*;

public class StringConversion
{
	public static void main(String[] args)
	{
		toLowerCase();
	}
	
	public static String toLowerCase()
	{
		String input = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a word: ");
		input = sc.nextLine();
		System.out.println("Upper to lower: " + input.toLowerCase());
		return input;				
	}
			

}
