package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangulo;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		
		System.out.println("Enter rectangle width and heigth: ");
		retangulo.heigth = sc.nextDouble();
		retangulo.width = sc.nextDouble();
		
		
		System.out.println(retangulo);
		
		
		
	}

}
