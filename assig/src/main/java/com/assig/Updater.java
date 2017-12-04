package com.assig;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Updater extends Creation implements Input {
	
	public void update() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Name of book to edit");
		String l = sc.nextLine();
		List<Data> new_list = new ArrayList<>();
		new_list = new Read().read(new_list, true);
		boolean flag = false;
		for (Data j : new_list)

		{
			String test = j.getTitle();

			if (test.equals(l)) {
				update_checker(j);
				flag = true;
			}

		}

		if (flag)
			create(new_list, true);
		else
			System.out.println("Book with the given title does not exist");

	}

	public void create(List<Data> p, boolean ch) {
		Gson gson = new GsonBuilder().create();
		if (ch) {
			try (Writer writer2 = new FileWriter("Output.json")) {

				for (Data te : p) {
					gson.toJson(te, writer2);
					writer2.write("\n");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("File not found!!!");

			}

		} else {
			try (Writer writer = new FileWriter("Output.json", true)) {
				Data new_data = new Data();
				new_data = super.update_checker(new_data);

				gson.toJson(new_data, writer);
				writer.write("\n");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("File not found!!!");

			}
		}

	}

	@SuppressWarnings("resource")
	@Override
	public Data update_checker(Data new_data) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter updated book Name");
		new_data.setTitle(sc.nextLine());
		System.out.println("Enter updated book Author");
		new_data.setAuthor(sc.nextLine().toString());
		System.out.println("Enter updated book Publisher");
		new_data.setPublisher(sc.nextLine().toString());
		try {
			System.out.println("Enter updated book sysid(Number)");
			new_data.setSysid(sc.nextDouble());
		} catch (Exception InputMismatchException) {
			System.out.println("only numbers are accepted!!!");
		}
		
		return new_data;
	}

}
