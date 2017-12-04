package com.assig;

import java.util.List;
import java.util.Scanner;

public abstract class Creation implements Input {
	public abstract void create(List<Data> p, boolean ch);

	@Override
	public Data update_checker(Data new_data) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter new book Name");
		new_data.setTitle(sc.nextLine());
		System.out.println("Enter new book Author");
		new_data.setAuthor(sc.nextLine().toString());
		System.out.println("Enter new book Publisher");
		new_data.setPublisher(sc.nextLine().toString());

		try {
			System.out.println("Enter new book sysid(Number)");
			new_data.setSysid(sc.nextDouble());
		} catch (Exception InputMismatchException) {
			System.out.println("only numbers are accepted!!!\n");
		}
		
		return new_data;
	}
}
