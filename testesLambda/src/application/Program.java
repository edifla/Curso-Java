package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Maria", 3200.00, "maria@gmail.com"));
		list.add(new Employee("Alex", 1900.00, "alex@gmail.com"));
		list.add(new Employee("Marco", 1700.00, "marco@gmail.com"));
		list.add(new Employee("Bob", 3500.00, "bob@gmail.com"));
		list.add(new Employee("Anna", 2800.00, "anna@gmail.com"));
		
		System.out.print("Enter the full salary: ");
		double salary = sc.nextDouble();
		System.out.println("Email of people whose salary is more than " + salary);
		
		Comparator<String> comp = (x1,x2) -> x1.toUpperCase().compareTo(x2.toUpperCase());
		
		List<String> emails = list.stream()
				.filter(e -> e.getSalary() > salary)
				.map(e -> e.getEmail())
				.sorted(comp)
				.collect(Collectors.toList());
		
		emails.forEach(System.out::println);
		
		Double sos = list.stream()
				.filter(e -> e.getName().charAt(0) == 'M')
				.map(e -> e.getSalary())
				.reduce(0.0, (x,y) -> x + y);
		
		System.out.println("Sum of salary of people whose name starts with 'M': " + sos);
		
		sc.close();
	}

}
