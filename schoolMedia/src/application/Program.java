package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("Insert the first score: ");
		student.n1 = sc.nextDouble();
		
		System.out.print("Insert the second score: ");
		student.n2 = sc.nextDouble();
		
		System.out.print("Insert the third score: ");
		student.n3 = sc.nextDouble();
		
		System.out.print(student);
		sc.close();
	}

}
