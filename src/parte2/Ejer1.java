package parte2;

import java.util.ArrayList;
import java.util.*;

public class Ejer1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<>();
		
		for (int i = 0; i <= 10; i++) {
			
			lista.add(i);
			
		}
		
		System.out.println(lista);
		
		Collections.shuffle(lista);
		
		System.out.println(lista);

	}

}
