package prog6;

import java.util.Scanner;

import prog4.program4;

public class prog6callingclass {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the Author Name");
		String Author = a.nextLine();
		program4.Author_Search(Author);
	}

}
