package com.assig;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Read {

	public List<Data> read(List<Data> new_list, boolean check) {
		File txt = new File("Output.json");
		Gson gson = new GsonBuilder().create();
		Data p = new Data();

		try {
			Scanner in_value = new Scanner(txt);
			while (in_value.hasNext()) {
				p = gson.fromJson(in_value.nextLine(), Data.class);
				if (check) {
					new_list.add(p);

				} else {

					System.out.println(p);
				}
			}
			in_value.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new_list;
	}
}
