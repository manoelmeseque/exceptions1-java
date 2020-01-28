package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int p = sc.nextInt();
		
			System.out.println(vect[p]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição Invalida! ");
		}
		catch(InputMismatchException e) {
			System.out.println("Apenas use números para indicar uma posição");
		}
		System.out.println("Fim! ");
		sc.close();
	}

}
