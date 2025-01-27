package englishexercise;

import java.util.Scanner;
import java.util.TreeMap;

public class Ejer1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		TreeMap<String, Integer> list = new TreeMap<>();

		int value = 1;

		int wordLength = 0;

		boolean greaterThan2 = false;

		String input = sc.nextLine();

		while (!input.equals("END")) {

			String[] array;

			array = input.split(" ");

			for (int i = 0; i < array.length; i++) {

				if (array[i].length() > 2) {
					greaterThan2 = true;
				} else {
					greaterThan2 = false;
				}
				if (list.containsKey(array[i])) {

					value = list.get(array[i]);
					value++;
					list.replace(array[i], value);
				}
				if (greaterThan2 && !list.containsKey(array[i])) {
					list.put(array[i], 1);
				}
			}

			input = sc.nextLine();

		}
		System.out.println(list);

	}

}
