package com.assig;

import java.util.Scanner;

public class Run {
 

	@SuppressWarnings("resource")
	public void runner() {
		Scanner s = new Scanner(System.in);
		while (true) {
				menu();
			String input = s.next();
			switch (input) {
			case "1":
				Creation cr = new Updater();
				cr.create(null, false);
				break;
			case "2":
				new Read().read(null, false);
				break;
			case "3":
				new Updater().update();
				break;
			case "4":
				new Deleter().delete();
				break;
			default:
				System.out.println("breaking");
				break;
			
				
			}
			
		}
		
	}

	void menu() {
		System.out.println("\nLIBRARY MANAGEMENT SYSTEM");
		System.out.println("Press 1, 2, 3 or 4");
		System.out.println("-------------------------------------");
		System.out.println("1. CREATE/ADD NEW BOOK RECORD");
		System.out.println("2. READ BOOK RECORD");
		System.out.println("3. UPDATE BOOK RECORD");
		System.out.println("4. DELETE BOOK RECORD");
		System.out.println("-------------------------------------");
	}

}
