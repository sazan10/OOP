package com.assig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deleter extends Read {

	void delete() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Name/Title of book to delete");
		String l = sc.nextLine();
		List<Data> new_list = new ArrayList<>();
		new_list = read(new_list, true);
		boolean flag = false;
		for (Data j : new_list)

		{
			String test = j.getTitle();

			if (test.equals(l)) {
				System.out.println(new_list.get(new_list.indexOf(j)) + "has been deleted");
				new_list.remove(new_list.indexOf(j));
				flag = true;
				break;
			}

		}

		if (flag)
			new Updater().create(new_list, true);
		else
			System.out.println("Book with the given title does not exist");

	}


}
