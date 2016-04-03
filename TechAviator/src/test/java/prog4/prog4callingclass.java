package prog4;

import java.util.Scanner;

public class prog4callingclass {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Author Name");
		String Author = a.nextLine();
		
		program4.Author_Search(Author);
		
		
		
	}
}
