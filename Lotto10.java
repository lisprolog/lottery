import java.util.Scanner;

/*
	Simple Java program to count the Austrian Lottery numbers "6 von 45".
	In the numbers2.txt file are all picked numbers without "Zusatzzahl"from 1986 until 2015.
	LottoNumbersOrder.txt contains the result of this program.

	java Lotto10 < numbers2.txt 
*/

public class Lotto10{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);			// Scanner reads the numbers2.txt file
		int n;					
		int[] numbers = new int[46];				// Array to store 45 counts for 45 lottery numbers.
									// for simplicity, I chose a 46 items array.
		while(sc.hasNextInt()){
			n = sc.nextInt();
			numbers[n]++;	
		}

		for(int i = 1; i < numbers.length; i++){
			System.out.println(i + ": " +numbers[i]);	// the first item will not be printed, because it is empty.
		}
	}
}
