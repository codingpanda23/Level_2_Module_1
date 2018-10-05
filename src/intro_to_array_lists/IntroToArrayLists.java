package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> list = new ArrayList<String>();
		// 2. Add five Strings to your list
		list.add("Sunfish");
		list.add("Wombat");
		list.add("Totoro");
		list.add("Red Panda");
		list.add("Hedgehog");
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list);
		}
		// 4. Print all the Strings using a for-each loop
		//for (String stuff : list) {
			//System.out.println(stuff);
		//}
		// 5. Print only the even numbered elements in the list.
		//for (int i = 0; i < list.size(); i++) {
			//System.out.println(list.get(i));
		//}
		// 6. Print all the Strings in reverse order.
		for (int i = 0; i < list.size(); i++) {
			list.remove("Wombat");
			System.out.println(list);
		}	
		// 7. Print only the Strings that have the letter 'e' in them.
	}
}
